package basic;
//Dynamic Method dispatch
class C {
    public void show(){
        System.out.println("In A Show()");
    }

}

class K extends C {

    public void show2(){
        System.out.println("In B Show2()");
    }
}

public class A {
    public static void main(String[] args) {


       C obj=new K();
       obj.show();

       //super class reference variable and sub class object, it
        //can access only super class methods and same methods from sub class.
        //Here up casting will be performed
        //where sub class object will be changed to super class

        K obj1= (K) obj;
        obj1.show2();

        //this is downcasting , where an object of subclass with reference variable of a superclass
        //is Casted to subclass .
    }
}


