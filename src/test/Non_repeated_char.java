package test;

import java.util.*;
public class Non_repeated_char
{
    public static void main(String args[])
    {
        String str="swiss";
        char store=' ';
        int index=-1;

        char[]arrayStr= str.toCharArray();
        for(int j=0;j<arrayStr.length;j++)
        {
            char i=arrayStr[j];
            if(str.indexOf(i)==str.lastIndexOf(i))
            {
                store=i;
                break;
            }
            else
            {
                index=index+1;

            }
        }
        if(index==str.length()-1)
        {
            System.out.println("All characters are Repeating");
        }
        else
        {
            System.out.println("First non-repeating character is "+ store);
        }
    }
}