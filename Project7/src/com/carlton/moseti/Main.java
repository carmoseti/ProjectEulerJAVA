package com.carlton.moseti;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int position = 0;
        int stop = 10001;
        int a = 0;
        while ((position!=stop)){
            if (isPrime(a)){
                position ++;
            }
            a++;
        }
        System.out.println(a-1);
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
