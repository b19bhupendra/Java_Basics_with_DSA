package arrays_2D;

import java.util.Scanner;

public class AdditionMatrix {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row :: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the column :: ");
        int c1 = sc.nextInt();

        int [][]matrix1 = new int [r1][c1];
        System.out.println("Enter the matrix1 "+ r1*c1 +" elements");
        for(int i =0; i<r1;i++){
            for(int j =0; j<c1; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the row :: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the column :: ");
        int c2 = sc.nextInt();
        int [][]matrix2 = new int [r2][c2];
        System.out.println("Enter the matrix1 "+ r2*c2 +" elements");
        for(int i =0; i<r2;i++){
            for(int j =0; j<c2; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        sumMatrix(matrix1,r1,c1,matrix2,r2,c2);
        productMatrix(matrix1,r1,c1,matrix2,r2,c2);
    }
    public  static void printArray(int [][] arr){

        for(int i =0; i<arr.length;i++){ //row
            for(int j =0;j<arr[i].length;j++){ //column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumMatrix(int [][] matrix1,int r1,int c1,int [][] matrix2,int r2,int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong input matrix");
            return;
        }
        int [][]sumMatrix = new int[r1][c1];
        for(int i =0;i<matrix1.length;i++){
            for(int j =0; j<matrix1[i].length;j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printArray(sumMatrix);
    }
    public static void productMatrix(int [][] matrix1,int r1, int c1, int  [][] matrix2, int r2, int c2){
        if(c1!=r2){
            System.out.println("Please enter the correct dimensions of matrix");
            return;
        }
        int [][] productMatrix = new int [r1][c2];
        for(int i =0;i<r1;i++){ //row number
            for(int j=0;j<c2;j++){ //column number
                for(int k=0;k<c1;k++){ // here for matrix1 k is column as we have to increase column and for matrix2 k is row as we have to change the row
                productMatrix[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrix is :");
        printArray(productMatrix);
    }
}
