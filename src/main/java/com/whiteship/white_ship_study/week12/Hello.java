package com.whiteship.white_ship_study.week12;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Retention : 이 에너테이션을 언제까지 유지 할 것인지 지정
 * SOURCE, CLASS, RUNTIME 가능
 * Retention 에너테이션이 없으면 기본 policy 는 Class
 * 인수값을 주지 않는 것은 불가. (@Retention 이렇게는 불가.)
 *
 * SOURCE > CLASS > RUNTIME
 * SOURCE : 컴파일 후 에너테이션 정보 없어짐(ByteCode 에 없음, @Override 같은거)
 * CLASS : 에너테이션에 대한 정보를 바이트코드에도 남김(클래스 정보에 들어간다.)(런타임 중에 바이트코드 정보를 읽는 것도 Byte Buddy 같은걸로 가능함.)
 * RUNTIME : 런타임에는 클래스정보를 클래스로더가 읽어서 메모리에 적재. 그 때 에너테이션 정보를 누락시킴. 리플렉션 안됨. 리플렉션되게 할거면 RUNTIME
 * 필요한 범위 만큼만 선언하기
 */

/**
 * Inherited 는 하위 클래스까지 에너테이션의 정보를 전파하고 싶다.
 * 당연히 Retention 도 따라간다.
 *
 * 부모의 에너테이션을 참조해도 된다.
 */
@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Hello {
    String value() default "";
}
