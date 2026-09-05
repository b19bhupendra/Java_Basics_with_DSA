package multithreadingRevision;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessExample
{
    //SO if passing true in ReentrantLock then it will maintain order and all thread will get chance to aquire lock.

    private  final Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+ "acquired the lock");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName() + " released the lock ");
        }
    }

    public static void main(String [] args){
        UnfairLockExample exmaple = new UnfairLockExample();

        // Runnable object
        Runnable task = new Runnable() {
            @Override
            public void run() {
                exmaple.accessResource();
            }
        };
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread2");
        Thread thread3 = new Thread(task, "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
