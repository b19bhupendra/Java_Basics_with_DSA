//Write a Java program to calculate the average of a list of numbers using a do-while loop.
package Basics;
import java.util.*;
public class do_while
{
    public static void main(String[] args)
    {
        double sum = 0, num = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.print("Enter any positive number, enter -1 to quit: ");
            num = scan.nextDouble();
            if (num != -1)
            {
                if (num <= 0)
                {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                sum += num;
                count++;
            }
        }
        while (num != -1);
        {
            System.out.printf("Average is : %.2f/%d = %.2f%n", sum, count, sum / count);
        }

    }
}

/*

    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int average=0;
        do
        {
            System.out.println("Calculating the average of the numbers ");
            average=(n1+n2+n3)/3;

        }
        while (average==0);
        {
            System.out.println(average);
        }
    }
*/