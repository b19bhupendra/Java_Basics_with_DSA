package string;
import java.util.*;
public class Anagram
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the string1 ");
        String str1=sc.nextLine();
        System.out.println("Enter the string1 ");
        String str2=sc.nextLine();
        Anagram(str1,str2);
    }
    public static void Anagram(String str1,String str2)
    {
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int j=0;
        int flag=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[j])
            {
                flag=1;
                break;
            }
            j++;
        }
        if(flag==1) //we can also use if(Arrays.equals(arr1,arr2)
        {
            System.out.println("NOT");
        }
        else
        {
            System.out.println("Anagram");
        }
    }
}











