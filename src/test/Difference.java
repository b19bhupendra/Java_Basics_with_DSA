package test;
import java.util.*;
public class Difference
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int arr2[]={2,3,1,0,5};
        int m= arr2.length;
        for(int i =0;i<n;i++)
        {
            int j=0;
            for(j=0;j<m;j++)
            {
                if (arr[i] == arr2[j])
                {
                    break;
                }
            }
            if(j==m)
            {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
