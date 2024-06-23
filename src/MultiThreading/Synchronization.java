package MultiThreading;

class Car implements Runnable
{
    //using synchronized in method
    synchronized public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " Has enter the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Got into Car to Drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Came back and parked the car");
//-------------------------------------------------------------------------------------------------------------------------
           //using synchronized block when we need some specific block to be synchronized then we use block synchronization

         /* System.out.println(Thread.currentThread().getName() + " Has enter the parking lot");
            Thread.sleep(2000);
            synchronized (this)//this means this area jo block me hai usse synchronized kr rhy
            {
                System.out.println(Thread.currentThread().getName() + " Got into Car to Drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Came back and parked the car");
            } */
//------------------------------------------------------------------------------------------------------------------------
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
public class Synchronization
{
    public static void main(String []args)
    {
        Car obj = new Car();

        Thread t1= new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();

    }
}
