package arrays2D;
import java.util.*;
public class First
{
    public static void main(String []args)
    {

        //Array construction
        int arr[][]=new int[3][2];
        arr[0][0]=1;
        arr[0][1]=3;
        arr[1][0]=2;
        arr[1][1]=5;
        arr[2][0]=8;
        arr[2][1]=6;

        //printing the values
        for(int i =0;i<3;i++)
        {
            for(int j= 0;j<2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");
        int arr1[][]={ {2,3}, {5,4}, {9,3}  }; // another way for inserting the values
        System.out.println("Printting values of arr ");
        for(int i =0;i<3;i++)
        {
            for(int j= 0;j<2;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

       // Jaked Arrays
        System.out.println("----------Jacked array------------ ");
        int arr3[][]= { {1,2,3}, {4,5}, {7,6,5,4,3} };
        // to print this jaked arrays we use
        for(int i =0;i< arr3.length;i++)
        {
            for(int j =0;j<arr3[i].length;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------Another way of creating jacked arrays-------------");
        //another way of creating jaked arrays
        int arr4[][]=new int [3][]; // we do not give column size here
        // here we are giving size of each column
        arr4[0]=new int [1];// now here we are giving individual column size for each rows
        arr4[1]=new int [3];
        arr4[2]=new int [2];

        //initilazing vlaues
        arr4[0][0]=5;
        arr4[1][0]=1;
        arr4[1][1]=7;
        arr4[1][2]=8;
        arr4[2][0]=11;
        arr4[2][1]=4;

        for(int i =0;i< arr4.length;i++)
        {
            for(int j =0;j<arr4[i].length;j++)
            {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }


    }

}
