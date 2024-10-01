package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocCoupling.xml");
        UserManager UM1=(UserManager) context.getBean("UserManagerWithUserDatabaseProvider");
        UserManager UM2=(UserManager) context.getBean("UserManagerWithNewDatabaseProvider");
        UserManager UM3=(UserManager) context.getBean("UserManagerWithWebDatabaseProvider");
        System.out.println(UM1.getUserInfo());
        System.out.println(UM2.getUserInfo());
        System.out.println(UM3.getUserInfo());

    }
}
