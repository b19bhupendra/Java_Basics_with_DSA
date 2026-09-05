package arrays_2D;

import java.util.Scanner;

public class RevisionPascalsTriangle {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pascal matrix : ");
        int n = sc.nextInt();

        int [][] ans = pascal(n);
        printMatrix(ans);
    }
    public static int[][] pascal(int n){
        int[][] ans = new int[n][]; //Columns are not fixed in the each row so we will not define here columns

        for(int i=0; i<n; i++){
            //1. i th row have i+1 column so this will give me dynamic column spaces
            // ans[i] is an one d array itself and we are initializing its size
            //So basically we are creating an 1D array at each row inside an array
            ans[i] = new int [i+1];

            //2.First and last element of every row is one
            ans[i][0] = ans[i][i] = 1;

            //3.p[i][j] = p[i-1][j] + p[i-1][j-1];
            // j starting from 1 is because 0th column is already filled and less then i because ith column is also allready filled
            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void printMatrix(int [][] matrix){
        int row = matrix.length;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
