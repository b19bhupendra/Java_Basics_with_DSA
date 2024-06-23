package Exception_Handling;
import java.util.*;
public class Finally_block
{
    public static void main(String[]args)
    {
        int num=0;
        Scanner sc=new Scanner (System.in);
        try
        {
            num=sc.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Please enter the number ");
        }
        finally //it will execute always wether there is exception or not
        {
            sc.close(); //closing the resource
            //we are using the resource for inputing data e.i Scanner sc....
            //so we need to close the resource if we are using it
            System.out.println("resourse closed");
        }

        System.out.println(num);
    }
}
