package arrays_2D;
import java.util.Scanner;
public class Generation_matrix
{
    public static int[][] generateSpiral_matrix(int n)
    {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftcol = 0, rightcol = n - 1;
        int current = 1;
        while (current <= n * n)
        {
            //toprow= leftCo to rytcol
            for (int j = leftcol; j <= rightcol && current < n * n; j++)
            {
                matrix[topRow][j] = current;
                current++;
            }
            topRow++;

            //rightcol= toprow to bottomrow
            for (int i = topRow; i <= bottomRow && current < n * n; i++) {
                matrix[i][rightcol] = current;
                current++;
            }
            rightcol--;

            //BottomRow = rigthCol to leftCol
            for (int j = rightcol; j >= leftcol && current < n * n; j--)
            {
                matrix[bottomRow][j] = current;
                current++;
            }
            bottomRow--;

            //leftCol= bottomRow to toprow
            for (int i = bottomRow; i >= topRow && current < n * n; i--)
            {
                matrix[i][leftcol] = current;
                current++;
            }
            leftcol++;
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
        public static void main (String []args)
        {
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter the n");
            int n =sc.nextInt();

            int [][] mat = generateSpiral_matrix(n);
            Print(mat);

        }
}