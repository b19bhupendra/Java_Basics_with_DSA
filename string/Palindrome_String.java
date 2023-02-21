package string;
import java.util.*;
public class Palindrome_String
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the String ");
        String str1=sc.nextLine();
        String str2="";
    Palindrome1(str1,str2);
    }
    public static void Palindrome1(String str1,String str2)
    {
        for(int i =str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }

}
