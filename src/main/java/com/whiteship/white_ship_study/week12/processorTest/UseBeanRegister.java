package com.whiteship.white_ship_study.week12.processorTest;

import com.register.beanregister.BeanRegister;
import com.register.beanregister.ClassType;

@BeanRegister(ClassType.CONTROLLER)
public class UseBeanRegister {
    public static void main(String[] args) {
        ModuleUseBeanRegister moduleUseBeanRegister = new ModuleUseBeanRegister();
        moduleUseBeanRegister.print();
    }
}


