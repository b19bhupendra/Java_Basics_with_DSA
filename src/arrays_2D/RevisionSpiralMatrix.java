package arrays_2D;

import java.util.Scanner;

public class RevisionSpiralMatrix {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int c = sc.nextInt();

        int [][] matrix = new int[r][c];
        System.out.println("Enter the values of the input matrix :");
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralMatrix(matrix,r,c);
    }

    public static void spiralMatrix(int matrix [][], int r, int c){
        int topRow = 0, bottomRow = r-1, leftColumn = 0, rightColumn = c-1;
        int total_elements = 0;
        //While loop will run until we print all the elements of the matrix eg- 5*5= 25 ele, 3*3 = 9 ele
        while(total_elements < r*c){
            //topRow -> leftColumn to rightColumn
            for(int j =leftColumn; j<= rightColumn && total_elements < r*c; j++){
                System.out.print(matrix[topRow][j]+" ");
                total_elements++;
            }
            //When toprow is printed then we have to increase the topRow by one
            topRow++;

            //rightColumn -> topRow to bottomRow
            for(int k=topRow; k<=bottomRow && total_elements < r*c; k++){
                System.out.print(matrix[k][rightColumn]+" ");
                total_elements++;
            }
            rightColumn--;

            //bottomRow -> rightColumn to leftColumn
            for(int b=rightColumn; b>=leftColumn && total_elements < r*c; b--){
                System.out.print(matrix[bottomRow][b] + " ");
                total_elements++;
            }
            bottomRow--;

            //leftColumn -> bottomRow to topRow
            for(int i=bottomRow; i>=topRow && total_elements < r*c; i--){
                System.out.print(matrix[i][leftColumn]+" ");
                total_elements++;
            }
            leftColumn++;
        }
    }
}
