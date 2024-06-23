package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_ele
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        int n =sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements in the arrays");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Duplicate(n,arr);
    }

    public static void Duplicate(int n, int arr[])
    {
        Arrays.sort(arr);
        int flag=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]+" ---> Duplicate element");
            }
        }
    }
    public static void Duplicate( int arr[])
    {
        Arrays.sort(arr);
        int flag=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]+" ---> Duplicate element");
            }
        }
    }
}
