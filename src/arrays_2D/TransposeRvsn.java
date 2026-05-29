package arrays_2D;

import java.util.Scanner;

/*
Question : Transpose of the matrix
        i/p ===> [[1,2,3],
                   [4,5,6],
                   [7,8,9]];

         o/p ===> [[1,4,7],
                   [2,5,8],
                   [3,6,9]];
 */
public class TransposeRvsn {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int c1 = sc.nextInt();

        int [][] matrix = new int[r1][c1];
        System.out.println("Enter the values of the input matrix one");
        for(int i =0; i<r1; i++){
            for(int j =0; j<c1; j++){
                matrix[i][j] = sc.nextInt();
            }
//            System.out.println("Enter the values of the next row");
        }
        transposeMatrix(r1,c1,matrix);
    }
    public static void transposeMatrix(int r1, int c1, int[][] matrix){

        int [][] transposeMatrix = new int [c1][r1];

        for(int i =0; i<r1; i++){
            for(int j =0; j<c1; j++){
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print(transposeMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Inplace Transpose :: ");
        inPlaceTranspose(r1,c1,transposeMatrix);
    }

    public static void inPlaceTranspose(int r1, int c1, int[][] matrix){

        for(int i =0; i<r1; i++){
            for(int j=i; j<c1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
