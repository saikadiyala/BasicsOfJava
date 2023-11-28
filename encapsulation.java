public class encapsulation {

    private int age;
    private String name;

    public encapsulation(){ //default constructor
        age=12;
        name="john";
    }

    public encapsulation(int age, String name){ //parameterrised constructor
        this.age=age;
        this.name=name;
    }


    //Getters and Setters
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        this.age=a;
    }
    public void setName(String n){
        this.name=n;
    }
}

