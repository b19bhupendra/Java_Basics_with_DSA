// Q3.  Traverse over the element of the array {1,2,3,4,5,7,8,9} using for each loop and print all even elements

package arrays;
import java.util.*;
public class Q3_for_each
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the arrays");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the values in the array");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Foreach(arr,n);
    }
    public static void Foreach(int arr[],int n )
    {
        for(int x:arr)
        {
            if(x%2==0)
            {
                System.out.println(x);
            }
        }
    }

}
