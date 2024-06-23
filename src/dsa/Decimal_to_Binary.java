package dsa;

import java.util.Scanner;

public class Decimal_to_Binary
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int decimal_num=sc.nextInt();
        int ans=0;
        int pw=1;// powers of 10

        while(decimal_num>0)
        {
            int parity=decimal_num%2;
            ans=ans+(parity*pw);
            decimal_num=decimal_num/2;
            pw=pw*10;//1, 1*10=10, 10*10=100, 100*10=1000,...
        }
        System.out.println(ans);
    }
}
