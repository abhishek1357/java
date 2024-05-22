package BasicJava;



class Counter{
    public int i=0;
    public synchronized void increment(){ // only one thread will be able to access at a time
        i++;
    }

}
public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // using lambda instead of creating class or using anonymous class
        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++)
                counter.increment();
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++)
                counter.increment();
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // wait for thread to complete execution and join main thread
        t1.join();
        t2.join();

        //System.out.println("value of i = " + counter.i);
        // we would value of i will be 10k+10k = 20k after all increments but value without synchronization will be random

        // value after using synchronization method will be 20k
        System.out.println("value of i = " + counter.i);
    }
}
