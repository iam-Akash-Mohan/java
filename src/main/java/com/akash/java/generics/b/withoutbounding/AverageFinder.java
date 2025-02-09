package com.akash.java.generics.b.withoutbounding;

/**
 * @author Akash M
 */
public class AverageFinder<T> {
    T[] num;

    public AverageFinder(T[] num) {
        this.num = num;
    }

    void printAverage(){
        double ans = 0;
        for(T i : num){
            //causes compilation issue
//            i.doubleValue();
        }
    }
}
