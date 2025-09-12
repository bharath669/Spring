package com.example.autowire.constructor;

import com.example.autowire.name.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowireByName.xml");
        com.example.autowire.name.Car myCar= (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
