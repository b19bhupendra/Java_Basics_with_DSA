package arrays;
import java.util.*;

//- Given an array sorted in increasing order of size n and an integer x, find if there exists a
//pair in the array whose absolute difference is exactly x.(n>1)
//N = 5
//Arr[] = [5,10,15,20,26]
//x= 10 output--> yes

//N = 7
//Arr[] = [1, 2, 3, 4, 5, 6, 7]
//x= 0 output--> no
public class Absolute_diff
{
    public static void main(String[]args)
    {
        int [] arr={5,10,15,20,26};
        int x=10;
        Difference(arr,x);
        Absolute2(arr,x);

    }
    public static void Difference(int arr[],int x)
    {
        int diff=0;
        int flag=0;
        for(int i =0;i<arr.length-1;i++)
        {
            for( int j =i+1;j<arr.length;j++)
            {
                diff =arr[j]-arr[i];
                if(diff==x)
                {
                    flag=1;
                }
            }

        }
        if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static  void Absolute2(int arr[],int x)
    {
        int diff2=0;int j=arr.length-1;
        for(int i =0;i<arr.length;i++)
        {
            diff2=arr[j]-arr[i];
            if(diff2==x)
            {
                System.out.println("YES");
                break;
            }
            if(diff2<x)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
    }
}
