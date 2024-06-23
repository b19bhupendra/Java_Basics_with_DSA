package arrays;
import java.util.*;
public class ThreeSum
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner (System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the values in the arrays");
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
//        ThreeSum(n,arr);
        int arr2[] = ThreeSum(n,arr);
        System.out.println("Values in the arr2 array:");
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
    }
    public static int[] ThreeSum(int n, int arr[])
    {
        Arrays.sort(arr);
        int val=0;
        int arr2[]=new int[arr.length];
        int k=0;
        for(int i = arr.length-1; i>0 ; i--)
        {
            val = arr[i]-arr[i-1];
            arr2[k]=val;
            k++;
        }
        return arr2;
    }
}
