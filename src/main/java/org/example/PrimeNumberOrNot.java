package org.example;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        checkPrimeNumber(14);
    }

    public static void checkPrimeNumber(Integer in){
        Integer halfIn = in/2;
        boolean isPrime = true;
        while (halfIn > 1){
            if(in % halfIn == 0){
                isPrime = false;
                break;
            }
            halfIn--;
        }

        if(isPrime){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }

}
