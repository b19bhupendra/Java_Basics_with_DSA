package MultiThreading;


class Library implements Runnable
{
    String res1=new String("JAVA");
    String res2=new String("SQL");
    String res3 = new String("DSA");
    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("student1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("Student one acquired the "+res1);
                    Thread.sleep(3000);
                    synchronized (res2)
                    {
                        System.out.println("student to acquired the "+res2);
                        Thread.sleep(3000);
                        synchronized (res3)
                        {
                            System.out.println("student 3 acquired the "+res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Something went wrong");

            }
        }
        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized (res3)
                {
                    System.out.println("Student 2 acquired the " + res3);
                    Thread.sleep(3000);
                    synchronized (res2)
                    {
                        System.out.println("student 2 acquired the " + res2);
                        Thread.sleep(3000);
                        synchronized (res1)
                        {
                            System.out.println("student 2 acquired the " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Something went wrong");
            }
        }

    }
}

public class Dead_LOCK
{
    public static void main(String []args)
    {
        Library obj = new Library();

        Thread t1= new Thread(obj);
        Thread t2=new Thread(obj);

        t1.setName("student1");
        t2.setName("student2");

        t1.start();
        t2.start();

    }
}
