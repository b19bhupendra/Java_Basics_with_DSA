package arrays_2D;
import java.util.*;
public class Sum_2_matrix
{
    public static void Sum(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2)
    {
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("wrong input - Addition not possible");
            return;
        }
        int[][]sum=new int [r1][c1];
        for(int i=0;i< r1;i++) //row
        {
            for(int j=0;j<c1;j++)//column
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Addition of two matrix");
        display(sum);
    }
    public static void multiply(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2)
    {
        if(c1!=r2)
        {
            System.out.println("Multiplication not possible");
            return;
        }
        int product[][]=new int[r1][c2];

        for(int i=0;i<r1;i++)//row
        {
            for(int j =0;j<c2;j++) //column
            {
                for(int k=0;k<c1;k++)
                {
                    //product = ith row of arr1 * jth column of arr2
                    product[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrixs");
        display(product);
    }
    public static void display(int[][]matrix)
    {
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the number of rows");
        int r1= sc.nextInt();
        System.out.println("Enter the number of columns");
        int c1= sc.nextInt();

        int arr1[][]=new int [r1][c1];

        System.out.println("Enter "+ r1*c1+ " elements in arr1");
        for(int i =0;i<arr1.length;i++)
        {
            for(int j =0;j<arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows for mat 2");
        int r2=sc.nextInt();

        System.out.println("Enter the number of columns for mat 2");
        int c2=sc.nextInt();

        int arr2[][]=new int [r2][c2];
        System.out.println("Enter "+ r2*c2+ " elements in arr2");
        for(int i =0;i<arr2.length;i++)
        {
            for(int j =0;j<arr2[i].length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        Sum(arr1,r1,c1,arr2,r2,c2);
        System.out.println("----------------------------");
        multiply(arr1,r1,c1,arr2,r2,c2);
    }
}
