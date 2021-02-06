package com.carlton.moseti;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int max = 1000;
        int sum = 0;

        for (int i = 1; i < max; i++) {
            if ((i%3 == 0) || (i%5==0)){
                sum +=i;
            }
        }

        System.out.println("Sum is : ");
        System.out.println(sum);
    }
}
