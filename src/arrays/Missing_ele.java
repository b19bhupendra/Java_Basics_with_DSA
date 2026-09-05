package arrays;
import java.util.*;
public class Missing_ele
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of the arrays");
        int n =sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the number in the arrays ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Missing(n,arr);
        Missing2(n,arr);

    }
    public static void Missing(int n, int arr[])
    {
        int diff=0;int ans=0;
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++)
        {
            diff=arr[i+1]-arr[i];
            if(diff==2)
            {
                ans=arr[i]+1;
            }
        }
        System.out.println(ans);
    }
    public static void Missing2(int n , int arr[])
    {
        int total_sum=((n)*(n+1))/2;
        int array_Sum=0;
        for(int i=0;i<arr.length;i++)
        {
            array_Sum=arr[i]+array_Sum;
        }
        int missing=total_sum-array_Sum;

        System.out.println(missing);
    }
}
