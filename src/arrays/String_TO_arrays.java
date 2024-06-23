//Q2. Convert the list of String {"ab","bc","cd","de","ef","fg"} into an array of Strings and print all the Strings
//stored on odd indices of the array.


package arrays;
import java.util.Scanner;
public class String_TO_arrays
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the arrays");
        int n= sc.nextInt();

        String str[]=new String [n];
        //String [] arr={"ds","jfk","dkf"};

        System.out.println("enter the strings in arrays");
        for(int i=0;i<str.length;i++)
        {
            str[i]=sc.nextLine();
        }
        toString(str,n);
    }

    public static void toString(String str[],int n )
    {
        for(int i =0;i<str.length;i++)
        {
            if(i%2!=0)
            {
                System.out.println(str[i]);
            }

        }
    }
}
