package com.akash.java.generics.c_practice;

/**
 * @author Akash M
 */
public class Student extends Person{

    public Student(String name) {
        super(name);
    }

    @Override
    public void whoAmI() {
        System.out.println(" I am s student");
    }
}
