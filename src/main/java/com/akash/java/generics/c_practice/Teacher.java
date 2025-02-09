package com.akash.java.generics.c_practice;

/**
 * @author Akash M
 */
public class Teacher extends Person{

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a teacher");
    }
}
