package basic;

class workerInterface implements interface1{

    @Override
    public void show4() {
        System.out.println("show4()");
    }

    @Override
    public void config4() {
        System.out.println("config4()");
    }

    public void sder(){
        System.out.println("sder");
    }

}
public class workInterface{
    public static void main(String[] args) {
       interface1 ob=new workerInterface();
        ob.config4();
        ob.show4();
    }
}

