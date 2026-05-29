package arrays_2D;

import java.util.Scanner;

public class RvsnRotationMatrix {
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
        }
        rotationMatrix(matrix);
    }

    public static void rotationMatrix(int [][]matrix){
        int row = matrix.length;
        int cols = matrix[0].length;
        int [][] transpose = new int [cols][row];

        //Transpose Matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
        //Reverse of Transpose Matrix to get the actual rotated matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<transpose[i].length/2; j++){
                int temp = transpose[i][j];
                transpose[i][j] = transpose[i][transpose[i].length-1-j];
                transpose[i][matrix[i].length-1-j] = temp;
            }
        }
        System.out.println("Rotation Matrix :->");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }


    }
}
