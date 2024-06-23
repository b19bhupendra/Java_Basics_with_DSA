package arrays_2D;

import java.util.*;

public class Spiral_Matrix
{
    public static void SpiralOrder_traverser(int [][]arr,int r, int c)
    {
        int topRow=0, bottomRow= r-1, leftcol=0, rightcol=c-1;
        int total_Elements=0;

        while(total_Elements<r*c)
        {
            //toprow= leftCo to rytcol
            for(int j =leftcol;j<=rightcol && total_Elements<r*c;j++)
            {
                System.out.println(arr[topRow][j]+" ");
                total_Elements++;
            }
            topRow++;

            //rightcol= toprow to bottomrow
            for(int i =topRow;i<=bottomRow && total_Elements<r*c;i++)
            {
                System.out.println(arr[i][rightcol]+" ");
                total_Elements++;
            }
            rightcol--;

            //BottomRow = rigthCol to leftCol
            for(int j=rightcol;j>=leftcol && total_Elements<r*c;j--)
            {
                System.out.println(arr[bottomRow][j]+" ");
                total_Elements++;
            }
            bottomRow--;

            //leftCol= bottomRow to toprow
            for(int i=bottomRow;i>=topRow && total_Elements<r*c;i--)
            {
                System.out.println(arr[i][leftcol]+" ");
                total_Elements++;
            }
            leftcol++;
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

        SpiralOrder_traverser(arr,row,col);
       // System.out.println( " Matrix ");
       // Print(arr);

    }
}
