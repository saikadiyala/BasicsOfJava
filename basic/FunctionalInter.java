package basic;

//Functional interface which contains only one method
//using @FunctionalInterface annotation to tell the compiler that the interface
//contains only ine method
@FunctionalInterface
interface s1{
    void show(int i,int j);
   // void run();
}

//class E implements s1{
//    public void show(){
//        System.out.println("in class E show()");
//    }
//
//}

public class FunctionalInter {
    public static void main(String[] args) {
       //this is not creating an object, as we cannot instantiate an interfce
        //we are instantiating a new object
        s1 e=new s1(){
            public void show(int i,int j){
                System.out.println("in class Main beside obj show()");
            }
        };
        e.show(10,20);
       //so for functional interfaces , from java 8 rather than writing
        //new and everything , we have lambda functions ()=>{}
        //as we only have one function, we define that in the brackets.
        s1 e1=(i,j)-> {
            System.out.println("using lambda show()");
        }
        ;
        e1.show(10,20);





    }
}
