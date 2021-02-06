package com.carlton.moseti;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int max_divisor = 20;
        int i = 1;
        int multiplier = 0;
        int a;
        while (multiplier==0){
            a = i * max_divisor;
            for (int j = 1; j <= max_divisor ; j++) {
                if (a%j != 0){
                    break;
                }
                if (j == max_divisor) {
                    multiplier = a;
                    break;
                }
            }
            i++;
        }
        System.out.println(multiplier);
    }
}
