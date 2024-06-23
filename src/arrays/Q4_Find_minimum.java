//Q4. Calculate the minimum element in the array {2,-3,5,8,1,0,-4} using standard library method for calculating the
//minimum element , output= -4

package arrays;
import java.util.*;
public class Q4_Find_minimum
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the values in the arrays");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        minimum1(arr,n);
        int result=minimum2(arr);
        System.out.println("Another method "+result);
    }
    public static void minimum1(int arr[],int n )
    {
        Arrays.sort(arr);

        System.out.println("By using Arrays.sort(arr) "+arr[0]);
    }
    public  static int minimum2(int arr[])
    {
        int mini=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }
        return mini;
    }
}
