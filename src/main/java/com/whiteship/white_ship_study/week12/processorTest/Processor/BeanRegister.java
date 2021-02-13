package com.whiteship.white_ship_study.week12.processorTest.Processor;

import com.register.beanregister.ClassType;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface BeanRegister {
    ClassType value() default ClassType.COMPONENT;
}
