package MultiThreading;
import java.util.*;

class calc extends Thread
{
    public void run()
    {
        System.out.println("Calculation Task Started ");

        Scanner sc= new Scanner (System.in);
        System.out.println("Please Enter the First number\n");
        int num1=sc.nextInt();

        System.out.println("Please Enter the second number ");
        int num2=sc.nextInt();

        int res =num1+num2;
        System.out.println(res);
        System.out.println("Calculation Task ended");
        System.out.println("----------------------------------------");
    }
}
class Message extends Thread
{
    public void run()
    {
        System.out.println(" Displaying important message task");
        try
        {
            for(int i =0;i<3;i++)
            {
                System.out.println("Focus is important to master the skills");
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
        System.out.println("Displaying important task is ended");
    }
}
public class Creating_MultipleThread
{
    public static void main(String []args)
    {
        System.out.println("Main Thread Started");
        calc t1=new calc();

        Message t2= new Message();

        t1.start();// we don't have to call run method to ye start method threads ko thread scheduler ko handover kr dega and then thread scheduler will decide
        t2.start();//which method will run

    }
}
//we don't have to call run method we have to call start method .If we call run method then program will run as normal there will be no use of multithreading
//here thread scheduler will decide which method will run first
//Thread scheduler make sure krega ki cpu ka time cycle waste ni horha h agr kisi thread ko schedule kiya h agr whn pe koi delay hain immideatly thread scheduler
//dusre thread ko schedule krega so that cpu ka timecycle waste na ho