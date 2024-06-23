package Basics;
import java.util.*;
public class If_else
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();

        if(n==0)
        {
            System.out.println("Entered number is ZERO");
        }
        else if(n<0)
        {
            System.out.println("Entered number is NEGATIVE");
        }
        else {
            System.out.println("Entered number is POSITIVE");

        }

    }
}
