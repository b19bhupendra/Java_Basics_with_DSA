//Write a Java program to print the Fibonacci series up to a given number using a for loop.
package Basics;
import java.util.*;
public class Fibonacci_series
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number upto which we have to print the fibonacci series");
        int n =sc.nextInt();
        int n1=0;
        int n2=1,n3;
        System.out.print(n1+" "+n2);//0,1
        for(int i =2;i<=n;i++)//2,3,5
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
