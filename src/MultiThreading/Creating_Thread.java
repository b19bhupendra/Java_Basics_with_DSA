package MultiThreading;

class MyThread extends Thread // MyThread extends Thread so Thread class k andr jitni bhi properties hongi vo MyThread me ajyegi
{
    public void run()
    {
        System.out.println("Child Thread");
    }

}


public class Creating_Thread
{
    public static void main(String args[])
    {
        MyThread obj = new MyThread();
        obj.start();//start method k andr hi run method call hota hai
        //we dont need to call the run method
        //we are starting means giving it to thread scheduler that will manage everything
    }
}
