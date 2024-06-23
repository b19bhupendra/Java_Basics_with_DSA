package arrays_2D;
import java.util.*;
public class Prefixsum_BruteForceApproch
{
    public static int BruteForecApproch(int arr[][],int r1,int c1,int r2,int c2)
    {
        int sum=0;
        for(int i =r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }


    public static void main(String []args )
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the numver of columns ");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        System.out.println("enter the "+ row*col+" elements ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the prefix r1 and c1 vlaues");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        System.out.println("Enter the prefix value r2 and c2 ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int ans=BruteForecApproch(arr,r1,c1,r2,c2);
        System.out.println("The Prefix sum using Brute Force Approch "+ans);
    }
}
