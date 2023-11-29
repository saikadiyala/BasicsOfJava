package basic;

public class SuperandThis {

    public SuperandThis(){
        System.out.println("in basic.SuperandThis");
    }
    public SuperandThis(int n){
        System.out.println("in basic.SuperandThis int");
    }

}

 class B extends SuperandThis {

    public B(){ // this calls basic.SuperandThis() default constructor first
        //super(); //even if we dont mention constrctor contains super()
        //super(5); // this will call basic.SuperandThis(int n)
        System.out.println("in basic.B");
    }

    public B(int n){
        this(); //executes constructor for same class
        System.out.println("in basic.B int");
    }


}


