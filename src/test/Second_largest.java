package test;
import java.util.*;
public class Second_largest
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        largest(n,arr);
    }
    public static void largest(int n,int arr[])
    {
        int max=0;int sec_lar=0;
        for(int i =0;i<arr.length;i++) // n=[1,3,4,6,2]
        {
            if(arr[i]>max)
            {
                sec_lar=max;
                max=arr[i];

            }
        }
        System.out.println(sec_lar);

    }
}
