package arrays_2D;

import java.util.Scanner;

public class Transpose
{
    //Transpose using new array i.e ans
    public static int[][]transpose_Mat(int arr[][],int r,int c)
    {
        int ans[][]=new int[c][r];//bec row col me change hoga to or col row me to size chnage ho jayega
        //transpose
        for(int i =0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
               ans[i][j]=arr[j][i];
            }
        }
       return ans; //Print(ans);
    }
    //Inplace transpose means not using new array
    public static void Inplace_transpose(int arr[][],int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j =i;j<c;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        Print(arr);
    }
    public static void Print(int [][]matrix)
    {
        for(int i =0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void  main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r= sc.nextInt();
        System.out.println("Enter the number of columns ");
        int c = sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter "+r*c+" elements ");

        for(int i =0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int ans[][]=transpose_Mat(arr,r,c);
        Print(ans);
        System.out.println("---------------------------------------------");
        Inplace_transpose(arr,r,c);

    }
}
