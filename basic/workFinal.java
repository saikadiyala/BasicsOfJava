package basic;

public class workFinal {

    final int x=10; //cannot be changed
   final public void show(){ //cannot be overridden
       System.out.println("in show ");
   }

    final public void show(int b){ //cannot be overridden
        System.out.println("in show ");
    }

    public void ad(int a,int b){
        System.out.println(a+b);
    }

}

