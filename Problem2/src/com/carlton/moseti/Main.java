package com.carlton.moseti;


public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int temp_b;
        int max = 4000000;
        int sum = 0;

        while (b<max){
            temp_b = b;
            b = a + b;
            a = temp_b;

            if (isEven(b)){
                sum += b;
            }
        }
        System.out.print("Sum is : ");
        System.out.print(sum);
    }

    private static boolean isEven(int number){
        return number%2==0;
    }

}
