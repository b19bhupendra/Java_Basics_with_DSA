package arrays;
import java.util.*;
public class Positive_Values
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of the arrays");
        int n =sc.nextInt();

        int arr[]=new int [n];
        System.out.println("Enter the values in the arrays");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Positive(n,arr);
    }
    public static void Positive(int n,int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
