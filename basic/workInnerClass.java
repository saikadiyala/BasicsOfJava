package basic;

// Inner classes

class InnerClass {

    int ge;
    public void show(){
        System.out.println("in main class show()");
    }
    class inner{

        public void config(){
            System.out.println("in inner class config()");
        }

    }

}

public class workInnerClass{
    public static void main(String[] args) {
        InnerClass ic=new InnerClass();
        ic.show();
        InnerClass.inner ob= ic.new inner();
        ob.config();

    }
}

