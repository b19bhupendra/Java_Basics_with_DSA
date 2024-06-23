package patters01;
import java.util.*;
public class Patter_01
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        //H

        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==(n-1)/2||j==0||j==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
