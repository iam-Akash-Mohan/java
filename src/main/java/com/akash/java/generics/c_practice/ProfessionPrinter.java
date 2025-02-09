package com.akash.java.generics.c_practice;

/**
 * @author Akash M
 */
public class ProfessionPrinter<T extends Profession>{

    private T profession;

    public ProfessionPrinter(T profession) {
        this.profession = profession;
    }

    void print(){
        this.profession.whoAmI();
    }
}
