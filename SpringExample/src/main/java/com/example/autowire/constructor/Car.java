package com.example.autowire.constructor;

import com.example.autowire.name.Specification;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details:"+specification.toString());
    }
}