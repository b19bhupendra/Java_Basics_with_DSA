//Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
//Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
//Leftmost and rightmost element cannot be a peak element.
//Output:
//7
package arrays;
import java.util.*;
public class Q5_Peak_element
{
    public static void main (String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the size of the arrays");
        int n =sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the element in the arrays");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Peak(arr,n);
    }
    public static void Peak(int arr[],int n)
    {
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
