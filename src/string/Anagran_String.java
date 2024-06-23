package string;
import java.util.*;
public class Anagran_String
{
    public static void main(String[]args)
    {
       Scanner sc= new Scanner (System.in);
       System.out.println("Enter the String one ");
       String str1=sc.nextLine();
       System.out.println("Enter the String two");
       String str2=sc.nextLine();

        boolean ans=Anagram(str1,str2);
        System.out.println(ans);
    }
    public static boolean Anagram(String str1,String str2)
    {
        if(str1.length()<=1&& str2.length()<=1)
        {
            System.out.println("Enter the valid String");
        }
        if(str1.length()!=str2.length())
        {
            return false;
        }

        //converting string to charaterArray String
        char[]arrStr1=str1.toCharArray();
        char[]arrStr2=str2.toCharArray();

        //sorting charater array
        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        if(Arrays.equals(arrStr1,arrStr2)==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
