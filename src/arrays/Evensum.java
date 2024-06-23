package arrays;
import java.util.*;
public class Evensum
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int i;
        for (i = 0; i < n; i++)
        {
            System.out.println("enter input size ");
            arr[i] = sc.nextInt();
        }
        int k=0;


        while (k < n)
        {
//           System.out.println("in while ");
            for (int j = 0; j <= arr[k]; j++)
            {
                if (j % 2 == 0)
                {
                    sum += j;
                }
            }
            System.out.println(sum);
            sum=0;
            k++;
        }
    }
}
