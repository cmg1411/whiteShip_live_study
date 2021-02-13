package com.whiteship.white_ship_study.week12.processorTest.Processor;

import com.register.beanregister.BeanRegister;
import com.register.beanregister.ClassType;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeanRegisterProcessor extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Stream.of(com.register.beanregister.BeanRegister.class.getName())
            .collect(Collectors.toSet());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return super.getSupportedSourceVersion();
    }

    /**
     * return type 이 true 이기 때문에, 이 메서드로 해당 에너테이션의 처리를 완료했다는 것을 알린다.
     * false 면 다음 processor 에게 처리를 넘겨야 함을 뜻한다.
     * 다음 프로세서에서도 처리가 필요한 경우 false 를 반환한다.
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // @BeanRegister 가 붙어있는 elements 를 읽어옴
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(com.register.beanregister.BeanRegister.class);

        // 반복문을 돌면서 하나하나 에너테이션에 대한 작업 실행
        for (Element element : elements) {
            Name elementName = element.getSimpleName();

            // 에너테이션이 붙어있는 곳이 CLASS 가 아니면 에러메세지 출력
            if (element.getKind() != ElementKind.CLASS) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Bean cannot registered with " + elementName);
            }
            if (element.getKind() == ElementKind.CLASS) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Processing " + elementName);
            }

            TypeElement typeElement = (TypeElement) element;
            // JavaPoet 라이브러리 사용
            ClassName className = ClassName.get(typeElement);

            // 요소값 가져오
            ClassType classType = element.getAnnotation(BeanRegister.class).value();

            // 메서드 만들기
            MethodSpec print = MethodSpec.methodBuilder("print")
                                        .addModifiers(Modifier.PUBLIC)
                                        .returns(String.class)
                                        .addStatement("System.out.println($S)", classType)
                                        .addStatement("return $S", classType)
                                        .build();

            // 메서드를 포함하는 클래스 만들기
            TypeSpec module = TypeSpec.classBuilder("Module" + elementName)
                                    .addModifiers(Modifier.PUBLIC)
                                    .addMethod(print)
                                    .build();

            // 실제 class 파일을 만듦
            Filer filer = processingEnv.getFiler();
            try {
                JavaFile.builder(className.packageName(), module)
                    .build()
                    .writeTo(filer); // 위에서 만든 클래스 파일을 write
            } catch (IOException e) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "FATAL ERROR : " + e);
            }
        }
        return true;
    }
}
