package MultiThreading;

public class Main_thread
{
    public static void main(String []args)
    {
        System.out.println("Main Thread");

        System.out.println("Before Changing");
        String name =Thread.currentThread().getName();
        System.out.println("The name of main Thread is "+name);
        System.out.println("The priority of main thread is "+Thread.currentThread().getPriority());

        System.out.println("After changing");
        //we can also change the name of the thread, priority of the thread
        Thread t=Thread.currentThread();
        t.setName("MyThread");//Changing the main thread name to MyThread
        t.setPriority(1);//Changing the Priority of the Main thread

        String name1 =Thread.currentThread().getName();
        System.out.println("The name of main Thread is "+name1);
        System.out.println("The priority of main thread is "+Thread.currentThread().getPriority());

    }
}
