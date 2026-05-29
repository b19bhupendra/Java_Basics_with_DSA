package arrays_2D;

import java.util.Scanner;

public class MultiDimensionArray {

    public  static void printArray(int [][] arr){

        for(int i =0; i<arr.length;i++){ //row
            for(int j =0;j<arr[i].length;j++){ //column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int r = sc.nextInt();
        System.out.println("Enter the column : ");
        int c = sc.nextInt();
        int [][]arr = new int [r][c];
        /*
        int [][] arr2 = { {3,4,5}, //Assigning values
                          {6,7,8}
                        }; */
        System.out.println("Enter "+ r*c +" elements ");
        for(int i =0; i<r;i++){ //row
            for(int j =0 ; j<c ;j++){ //col
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}
