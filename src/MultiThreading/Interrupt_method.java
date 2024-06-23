package MultiThreading;
class Example implements Runnable
{
    public void run()
    {
        for(int i =0;i<3;i++)
        {
            try
            {
                System.out.println("focus is important");
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println("Thread is interrupted");
            }
        }

    }

}
public class Interrupt_method
{
    public static void main(String[]args)
    {
        Example obj1 = new Example();
        Thread t1=new Thread(obj1);

        t1.start();
        t1.interrupt(); //interrupt method will only work when thread goes to sleep or in waiting state then
        //this interrupt method will work

    }
}
