package arrays_2D;
import java.util.*;
public class Basic
{
    public static void PrintArray(int arr2[][],int arr[][])
    {
        for(int i =0;i<arr2.length;i++) //row
        {
            for(int j=0;j<arr2[i].length;j++) //column
            {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();//new line

        }
        System.out.println();

        for(int i =0;i<arr.length;i++) //row
        {
            for(int j=0;j<arr[i].length;j++) //column
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();//new line

        }
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number of rows");
        int r= sc.nextInt();
        System.out.println("Enter number of columns");
        int c= sc.nextInt();

        int [][]arr= new int[r][c]; //user input

        System.out.println("Enter "+ r*c +" elements");
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }



        //another method to insert values in 2d arrays
        //int arr1[][]=new int [2][3];
      /* arr1[0][0]=1;
        arr1[0][1]=2; way to insert thw values in 2 d arrays
        arr1[0][2]=3;
        arr1[1][0]=5; */


        //another method to declare 2 d array
        int arr2[][]={
                {1,2,3},
                {5,6,7},
                {0,8,7}};

        PrintArray(arr2,arr);

    }
}
