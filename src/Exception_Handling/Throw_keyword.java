package Exception_Handling;

class customException extends Exception //custom exception our own exception
{
    //here in this we create an constructor
    public customException()
    {
    }
    public  customException(String msg)
    {
        //here we are making constructor so that we can pass message in object
        super(msg);//calling parent class constructor to print the msg
    }
}
public class Throw_keyword
{
    public static void main (String []args)
    {
        int num1=6;
        int num2=-1;

        try
        {
            if(num2<0)
            {
               // System.out.println("something went wrong");
                //calling the catch block by making the object of exception using throw keyword
                Exception e=new customException("Negative number "); //here we are creating object of our customException cls
                throw e;//jise hi exception throw hua wo catch block ko call kr dega
            }
            else
            {
                int result=num1/num2;
                System.out.println(result);
            }

        }
        catch (Exception e)
        {
            System.out.println("Enter the valid number "+e);
        }

    }
}
