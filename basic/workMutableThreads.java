package basic;

//Mutability of threads
//where both threads are accessing a single count and not giving accurate output

class counter{
    int count;
//    public void increment(){
//        count++;
//    }
    public synchronized void increment(){
        count++;
    }
}
public class workMutableThreads {
    public static void main(String[] args) throws InterruptedException {
        counter c=new counter();
        Runnable a1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    c.increment();
                }
            }
        };

        Runnable b1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    c.increment();
                }
            }
        };
        Thread t1=new Thread(a1);
        Thread t2=new Thread(b1);
        t1.start();
        t2.start();

        t1.join(); //telling to complete the thread , without this it may directly skip to
        //println(count) without thread completion bcs threads are taking time and main thread is waiting since long
        t2.join();
        System.out.println(c.count);

        //Here multiple threads might update the value of count at a same time
        //or while one is updating other might use the method to update the value.
        //so there will be issues with threads if not properly used.
        //for that synchronized keyword will be used
        //where two different threads cannot access at a same time

    }
}

