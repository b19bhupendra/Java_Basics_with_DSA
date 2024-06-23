//time complexity=O(n)
// Space complexity=O(1)
package arrays;
import java.util.*;
public class Reverse_Array
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of the arrays");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int flag=0;
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Reverse(n,arr);

    }
    public static void Reverse(int n, int arr[])
    {
        for(int i =0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
