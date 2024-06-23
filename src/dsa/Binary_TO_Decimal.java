package dsa;

import java.util.Scanner;

public class Binary_TO_Decimal
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int binary_num= sc.nextInt();
        int ans=0;
        int pw=1;// 2^0=1
        while(binary_num>0)
        {
            int unit_digit=binary_num%10;
            ans=ans+(unit_digit*pw);
            binary_num=binary_num/10;

            pw=pw*2;//1*2=2, 2*2=4, 4*2=8.....
        }
        System.out.println(ans);
    }
}
