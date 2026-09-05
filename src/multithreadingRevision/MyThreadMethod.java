package multithreadingRevision;

public class MyThreadMethod extends Thread
{
    MyThreadMethod(String name){
        super(name);
    }
    @Override
    public void run() { //jo kam humme dusre thread me  krwnana  h vo hum run method me likhenge
        System.out.println("Thread is running...........!!!!");
        for(int i=1; i<= 5; i++){
            System.out.println(Thread.currentThread().getName() + " -  Priority: "+
                    Thread.currentThread().getPriority()+"Count -"+ i);
            try {
                Thread.yield();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        MyThreadMethod low = new MyThreadMethod("low priority thread");
        MyThreadMethod medium = new MyThreadMethod("medium priority thread");
        MyThreadMethod high = new MyThreadMethod("high priority thread");
        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.setDaemon(true);
        low.start();
        medium.start();
//        high.start();
//        low.join();
        System.out.println("heyyy!!!!!!");
    }
}
