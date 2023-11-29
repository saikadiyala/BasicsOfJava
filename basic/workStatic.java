package basic;

public class workStatic {

    String brand;
    String price;
    static String name="smartPhone"; //all objects share the same name.

    public workStatic(){
        brand="";
        price="200";
        System.out.println("In constructor");
    }

    // can use static block to initialise static varibales which is called only once
    //Even if multiple objects are created static is called only once
    //at first object creation because object creation involves class loading
    //and object creation. class loading happens only once and then objects are created,
    //so only once static block is called while class loading.

//        static{
//            name="smartphone";
//            System.out.println("In Static block");
//        }


    public void show(){
        System.out.println(brand + " "+ price+" "+name);
    }

    //static methods cant access non static elements directly but can access them
    // using objects, if objects are shared through arguments then can access the value.
    public static void show1(workStatic ws){
        System.out.println(ws.brand + " "+ ws.price+" "+name);
    }
}
