package arrays;

import java.util.*;

public class Unique_Element
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        int  n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the values");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=findUnique(arr,n);
        System.out.println(ans);
    }
        public static int findUnique(int[] arr,int n)
        {
            Arrays.sort(arr);
            int ress=0;
            for(int i =0;i<arr.length-1;i++)
            {
                if(arr[i]!=arr[i+1])
                {
                    ress=arr[i];
                }

            }
            return ress;
        }
}