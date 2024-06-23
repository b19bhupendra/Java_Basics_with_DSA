package arrays_2D;
import java.util.*;
public class Rotate_matrix
{
    public static void Inplace_transpose(int arr[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j =i;j<col;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void reverseArray(int arr[])
    {
        int i=0, j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void Rotation(int arr[][],int row,int col)
    {
        //Step 1 ---> Transpose
        Inplace_transpose(arr,row,col);

        //step 2 --> alternating cols
        for(int i= 0;i<row;i++)
        {/*
                1,2,3
                4,5,6
                7,8,9

                i=0
                reverseArray({1,2,3})
             */
            reverseArray(arr[i]);
        }

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
    public static void main (String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("enter the number of columns ");
        int  col=sc.nextInt();

        int arr[][]=new int [row][col];
        System.out.println("Enter the "+ row*col+ "elements");

        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

       // Inplace_transpose(arr,row,col);

        Rotation(arr,row,col);

        System.out.println( "Rotatin Matrix ");
        Print(arr);

    }
}
