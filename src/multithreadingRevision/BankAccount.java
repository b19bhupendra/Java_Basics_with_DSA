package multithreadingRevision;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    //ReentrantLock is an class that implements lock interface.
    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount) {
        try {
            System.out.println(Thread.currentThread().getName() + " attempting to withdraw amount " + amount);
            if (lock.tryLock(10000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "Proceeding withdraw");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + "Completed withdrawal. Remaning balance :" + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "Low balance:-> ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock , will try later ");
            }
        }catch (Exception e ){
            Thread.currentThread().interrupt();
        }
    }

}
