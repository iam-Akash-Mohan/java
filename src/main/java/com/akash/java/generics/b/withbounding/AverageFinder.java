package com.akash.java.generics.b.withbounding;

/**
 * @author Akash M
 */
public class AverageFinder<T extends Number> {
    T[] num;

    public AverageFinder(T[] num) {
        this.num = num;
    }

    void printAverage(){
        double ans = 0;
        for(T i : num){
            ans+= i.doubleValue();
        }
        System.out.println(ans/num.length);
    }
}
