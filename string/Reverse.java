package string;
import java.util.*;
public class Reverse
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = sc.nextLine();
        String str2 = "";

        Reverse1(str1,str2);
        Reverse2(str1,str2);
        Reverse3(str1,str2);
    }
    public static void Reverse1(String str1,String str2)
    {
        for(int i =str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);
    }
    public static void Reverse2(String str1,String str2)
    {
        String arr[]=str1.split(" "); //this will convert string into array on basis of space
        for(int i=arr.length-1;i>=0;i--)
        {
            str2=str2+arr[i]+" ";
        }
        System.out.println(str2);
    }
    public static void Reverse3(String str1,String str2)
    {
        String arr[]=str1.split(" ");
        for(String element:arr)
        {
            for(int i =element.length()-1;i>=0;i--)
            {
                str2= str2+element.charAt(i);
            }
            str2=str2+" ";
        }
        System.out.println(str2);
    }
}
