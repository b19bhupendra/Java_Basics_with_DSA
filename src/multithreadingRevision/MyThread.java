package multithreadingRevision;

public class MyThread extends Thread{


    @Override
    public void run() {
        try{
            System.out.println("Running state : ");
            Thread.sleep(200);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String args []) throws InterruptedException {

        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        System.out.println("Main method ");
        Thread.sleep(100);
        System.out.println(myThread.getState());
        myThread.join();
        System.out.println(myThread.getState());
    }
}
