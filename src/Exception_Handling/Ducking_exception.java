package Exception_Handling;

import java.util.Scanner;

class DEmo
{
    public void a()
    {
        try
        {
            b();
        }
        catch (Exception e)
        {
            System.out.println("Error"+e);
        }

    }
    public void b() throws Exception
    {
        int num1=8;
        int num2=0;
       // try
       // {
            int res = num1 / num2;
            System.out.println(res);
        //}
      //  catch (Exception e)
      //  {
      //      System.out.println("error"+e.getMessage());
      //  } ab jo method call kr rha vo handel kre we can do this by using throws keyword
    }

}
public class Ducking_exception
{
    public static void main(String []args)
    {
        DEmo obj =new DEmo();
        obj.a();
    }
}
