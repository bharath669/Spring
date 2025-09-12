package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocExample {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationForIocLooseCoupling.xml");
        UserManager userManagerWithDb=(UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDb.getUserInfo());

        UserManager userManagerWithWS=(UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        UserManager userManagerWithNewDB=(UserManager)context.getBean ("userManagerWithWebServiceDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
