package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();

        long fibonacci = fibonacci(n);
        System.out.println("fibonacci of number n is : "+ fibonacci );
    }
    public static int fibonacci(int n){

        //base Case
        if(n==0){
            return n;
        }
        if(n==1){
            return 1;
        }
        int currentFibo = fibonacci(n-1) + fibonacci(n-2);

        return currentFibo;
    }
}
