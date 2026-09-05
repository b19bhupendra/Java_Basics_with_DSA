package arrays_2D;

import java.util.Scanner;

/*
Question : Reverse Each row of the matrix
        i/p ===> [[1,2,3,10],
                   [4,5,6,11],
                   [7,8,9,12]];

         o/p ===> [[10,3,2,1],
                   [11,6,5,4],
                   [12,9,8,7]];
 */
public class ReverseEachRow {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the column1 : ");
        int c1 = sc.nextInt();

        int [][] matrix = new int[r1][c1];
        System.out.println("Enter the values of the input matrix one");
        for(int i =0; i<r1; i++){
            for(int j =0; j<c1; j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println("Enter the values of the next row");
        }
        reverseMatrix(r1, c1, matrix);
    }

    public static void reverseMatrix(int r1, int c1, int [][] matrix){

        for(int i =0 ; i<r1; i++){
            for(int j =0; j< matrix[i].length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length-1-j];
                matrix[i][matrix[i].length-1-j] = temp;
            }
        }
        printArray(matrix);

    }
    public  static void printArray(int [][] arr){

        for(int i =0; i<arr.length;i++){ //row
            for(int j =0;j<arr[i].length;j++){ //column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
