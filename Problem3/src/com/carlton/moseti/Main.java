package com.carlton.moseti;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int prime_factor=0;
        long number = 600851475143L;
//        int number = 13195;

        for (int i = 2; i <= number; i++) {
            if (isPrime(i)){
                if (number%i==0){
                    number = number/i;
                    prime_factor = i;
                }
            }
        }

        System.out.println(prime_factor);

    }

    private static boolean isPrime(int number){
        if (number<2)
            return false;
        for (int i=2; i<number; i++){
            if (number%i==0)
                return false;
        }
        return true;
    }
}
