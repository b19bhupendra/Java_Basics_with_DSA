package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialN {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();

        long facts = factorial(n);
        System.out.println("Factorial of number n is : "+ facts );

    }
    public static long factorial(int n){
        long ans =1;
        if(n==0){
            return 1;
        }
        ans = n * factorial(n-1);
        return ans;
    }
}
