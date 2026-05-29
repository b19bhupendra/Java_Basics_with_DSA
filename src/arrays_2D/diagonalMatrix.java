package arrays_2D;

import java.util.Scanner;

public class diagonalMatrix {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();

        int [][]matrix = new int[row][column];
        System.out.println("Enter the values in the matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        diagonalMatrix(row,column,matrix);
    }

    public static int [][] diagonalMatrix(int row, int column, int [][]matrix){

        for(int i=0; i<row; i++){

        }





        return matrix;
    }
}
