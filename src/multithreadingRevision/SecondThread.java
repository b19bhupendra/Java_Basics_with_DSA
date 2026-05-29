package multithreadingRevision;

public class SecondThread extends Thread {

    @Override
    public void run() {
        for(int i =0; i<100000; i++){
            System.out.println("OverRiding thread method run by extending Thread Class"
            + Thread.currentThread().getName());

        }
    }
}
