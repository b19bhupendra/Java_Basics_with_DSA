package arrays_2D;
import java.util.*;

//time complexity = O(m*n)
// space complexity = O(1)
public class Rotation_matrix
{
    public static void main(String []args)
    {
        int [][]arr= {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                    };

        rotatedMatrix(arr);
        for(var mat:arr)
        {
            System.out.println(Arrays.toString(mat));

        }
    }
    public static void rotatedMatrix(int [][]arr)
    {
        int m =arr.length;
        int n =arr[0].length;// pheli row (row no. zero) me jayege of check krege usme kitne number of values hain
        //step 1- Transpose of the matrix
        for(int i =0;i<m;i++)
        {
            for(int j =i;j<n;j++)
            {
                int temp=arr[i][j]; // interchanging rows and column for transposing
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //step 2- swap the left and right elements
        for(int i=0;i<m;i++)
        {
            int leftindex=0;
            int rytindex=n-1;

            while(leftindex<rytindex)
            {
                int temp=arr[i][leftindex];
                arr[i][leftindex]=arr[i][rytindex];
                arr[i][rytindex]=temp;

                leftindex++;
                rytindex--;
            }
        }
    }
}
