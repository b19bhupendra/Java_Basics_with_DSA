package pattern;
import java.util.Scanner;
public class Patter01
{
        public static void main(String[] args)
        {
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter the number of Rows ");
            int n = sc.nextInt();

            for(int i=0;i<n;i++)
            {
                for (int j =0;j<n;j++)
                {
                    if(i==0|| j==0 || i==(n-1)/2|| j==n-1)
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
