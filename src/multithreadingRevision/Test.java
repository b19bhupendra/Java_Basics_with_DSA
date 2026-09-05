package multithreadingRevision;

public class Test {


    public static void main(String args[]){
//        SecondThread st = new SecondThread(); //new state
//        st.start(); //  runnable state
//        for( ; ; ){
//            System.out.println("current Thread Id : "+ Thread.currentThread().getId());
//            System.out.println("Current Thread is : "+ Thread.currentThread().getName());
//        }
        Counter counter = new Counter();
        MyThreaderCounter t1 = new MyThreaderCounter(counter);
        MyThreaderCounter t2 = new MyThreaderCounter(counter);
        t1.start();
        t2.start();
        System.out.println("current thread");
        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(counter.getCount());

    }

}
