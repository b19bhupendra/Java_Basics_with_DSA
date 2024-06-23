package Recursion;

import java.util.*;
public class Natural_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();

        printIncreasing(n);

    }
    public static void printIncreasing(int n)//1,2,3,...n-1,n
    {
        if(n==1)
        {
            System.out.println("1");
            return;
        }
        printIncreasing(n-1);//1,2,3..n-1
        System.out.println(n);
    }
    
}
