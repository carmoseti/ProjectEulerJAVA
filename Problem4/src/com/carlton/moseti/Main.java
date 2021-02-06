package com.carlton.moseti;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int max = 1000;
        int palindrome = 0;

        for (int i = 100; i < max; i++) {
            for (int j = 100; j < max; j++) {
                if (isPalindrome(i*j)){
                    palindrome = i*j;
                }
            }
        }
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(int number){
        String strNumber = Integer.toString(number);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(strNumber.substring(strNumber.length()/2));
        String strNumber1 = strNumber.substring(0,strNumber.length()/2);
        String strNumber2 = stringBuilder.reverse().toString();
        return strNumber1.equals(strNumber2);
    }

}
