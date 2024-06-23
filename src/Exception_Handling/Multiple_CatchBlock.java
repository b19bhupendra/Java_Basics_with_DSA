package Exception_Handling;

import java.sql.SQLOutput;

public class Multiple_CatchBlock
{
    public static void main(String []args)
    {
        int num1=15;
        int num2=5;
        int result=0;
        int arr[]={1,2,3,4,5};
        try
        {
            result=num1/num2;
            System.out.println(arr[6]);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error"+e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(arr[arr.length-1]);
            System.out.println("Access the proper size");
        }
        catch (Exception e)
        {
            System.out.println("general Exception agr koi atta h to isme ajyega");
        }
        System.out.println(result);
        System.out.println("BYE");
    }
}
