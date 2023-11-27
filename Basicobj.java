class Calc{

    int a=10;

    //Method overloading
    public int add(int num1,int num2){
        return num1+num2;
    }
 //name and type is important for method overloading
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
}

public class Basicobj {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        //Each object has its own memory
        Calc calc=new Calc();
        Calc calc1=new Calc();

        int result= calc.add(num1,num2);
        int result1= calc.add(num1,num2,5);

        calc.a=11;

        System.out.println(calc.a); //11
        System.out.println(calc1.a); //10
        // each obj has own memory so changing the value
        // of instance variable from one object is not reflecting other.
    }
}
