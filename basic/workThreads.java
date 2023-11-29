package basic;

//class A extend Thread or implements Runnable

//Threads

/*
class A1 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Hello");
        }

    }
}
*/
/*
class B1 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");

        }
    }
}
 */
public class workThreads {
    public static void main(String[] args) {
        /*
        A1 a1=new A1();
        B1 b1=new B1();

        System.out.println(a1.getPriority());
        System.out.println(b1.getPriority());

        //This makes the threads to run parallely rather than one after the other
        a1.start();//starts the thread
        //whenever it starts, it runs the run() method
        b1.start();
        */
        /*
        //can have interface as reference and class object
        Runnable a1=new A1();
        Runnable b1=new B1();
        //if using Runnable , then we need to create Threads and send the Runnable objects
        Thread t1=new Thread(a1);
        Thread t2=new Thread(b1);
        t1.start();
        t2.start();
         */

        //using lambdas and rewriting as Runnable is a functional interface
        Runnable a1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("Hello");
                }
            }
        };

        Runnable b1=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("Hi");
                }
            }
        };
        Thread t1=new Thread(a1);
        Thread t2=new Thread(b1);
        t1.start();
        t2.start();

    }


}
