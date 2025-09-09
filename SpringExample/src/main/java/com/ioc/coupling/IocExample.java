package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocExample {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationForIocLooseCoupling.xml");
        UserManager userManagerWithDb=(UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDb.getUserInfo());

//        ApplicationContext context1=new ClassPathXmlApplicationContext("applicationForIocLooseCoupling.xml");
        UserManager userManagerWithWS=(UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithWS.getUserInfo());

//        ApplicationContext context2=new ClassPathXmlApplicationContext("applicationForIocLooseCoupling.xml");
        UserManager userManagerWithNewDB=(UserManager)context.getBean ("userManagerWithWebServiceDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
