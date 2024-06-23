//time complexity=O(n)
//Space Complexity=O(1)

package arrays;
import java.util.*;
public class Palindrome_Array
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

        Palindrome(n,arr,flag);
    }
    public static void Palindrome(int n , int arr[],int flag)
    {
        for(int i =0;i<n/2;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                flag=1;
                System.out.println("NOT Palindrome Array");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Palindrome Arrays");
        }

    }
}
