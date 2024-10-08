package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(10);
    }

    static void fibonacciSeries(Integer n){
        Integer n1 = 0;
        Integer n2 = 1;
        Integer n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 2; i < n; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
