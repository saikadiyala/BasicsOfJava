public class SuperandThis {

    public SuperandThis(){
        System.out.println("in SuperandThis");
    }
    public SuperandThis(int n){
        System.out.println("in SuperandThis int");
    }

}

 class B extends SuperandThis {

    public B(){ // this calls SuperandThis() default constructor first
        //super(); //even if we dont mention constrctor contains super()
        //super(5); // this will call SuperandThis(int n)
        System.out.println("in B");
    }

    public B(int n){
        this(); //executes constructor for same class
        System.out.println("in B int");
    }


}


