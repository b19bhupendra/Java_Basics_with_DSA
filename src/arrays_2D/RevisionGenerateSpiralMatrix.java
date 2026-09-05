package arrays_2D;

import java.util.Scanner;

public class RevisionGenerateSpiralMatrix {
    public static void main (String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the n");
        int n =sc.nextInt();

        int [][] mat = generateSpiral(n);
        Print(mat);

    }
    public static int [][] generateSpiral(int n){
        int topRow =0, bottomRow = n-1, leftColumn =0, rightColumn= n-1;
        int current =1;
        int [][]matrix = new int[n][n];

        while(current< n*n) {

            //topRow :-> leftCol to rytCol
            for (int i = leftColumn; i <= rightColumn && current <= n * n; i++) {
                matrix[topRow][i] = current++;
            }
            topRow++;

            //rightColumn-> topRow to bottomColmn
            for (int j = topRow; j <= bottomRow && current <= n * n; j++) {
                matrix[j][rightColumn] = current++;
            }
            rightColumn--;

            //BottomRow-> rytColmn to leftColmn
            for (int b = rightColumn; b >= leftColumn && current <= n * n; b--) {
                matrix[bottomRow][b] = current++;
            }
            bottomRow--;

            //leftColumn-> bottomRow to topRow
            for (int l = bottomRow; l >= topRow && current <= n * n; l--) {
                matrix[l][leftColumn] = current++;
            }
            leftColumn++;
        }
        return matrix;
    }
    public static void Print(int [][]matrix)
    {
        for(int i =0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
