package com.carlton.moseti;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 100;
        int a = 1;
        int d = 1;
        int sum = (n/2)*(2*a + (n- 1)*d);
        int sum_2 = (n*(n+1)*((2*n)+1))/6;
        int diff = (sum*sum)-sum_2;
        System.out.println(diff);
    }
}
