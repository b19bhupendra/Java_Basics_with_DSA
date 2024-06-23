package string;

import java.util.Scanner;

public class SumString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for string 1 ");
        String num1 = sc.nextLine();
        System.out.println("Enter the number for string 2");
        String num2 = sc.nextLine();

        String output = stringSum(num1,num2);

        System.out.println(output);

    }
    public static String stringSum (String num1, String num2 )
    {
        String sum ="";
        int numInt1= Integer.parseInt(num1);
        int numInt2= Integer.parseInt(num2); //String to integer
        int sum1 =numInt1 + numInt2;
        // Integer.valueOf(num1); // another way to convert string to integer

        sum = String.valueOf(sum1);//int to string
//        System.out.print(sum1);


        return sum;
    }
}
