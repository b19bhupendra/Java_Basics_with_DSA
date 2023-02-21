package string;
import java.util.*;
public class Mutable
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the String ");
        String str= sc.nextLine();
        //StringBuilder
        StringBuilder sb=new StringBuilder(str); //or StringBuilder sb= new StringBuilder("Hello");
        System.out.println(sb);
        sb.append("Java");
        System.out.println(sb);
        //StringBuffer
        StringBuffer sb1=new StringBuffer("HEy");
        sb1.append("Hello");
        System.out.println(sb1);

    }
}
