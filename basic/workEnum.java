package basic;

//enum is a class but cannot be extended
enum Status{
    Running,Failed,Pending,Success;
}
public class workEnum {
    public static void main(String[] args) {
        Status s=Status.Running;
        System.out.println("class: "+ s.getClass().getSuperclass());
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] s1=Status.values();
        for(Status ss:s1){
            System.out.println(ss+" "+ss.ordinal());
        }

        if(s==Status.Running)
            System.out.println(s);
        else if(s==Status.Success)
            System.out.println("success");
        else if(s==Status.Failed)
            System.out.println("Failed");
        else
            System.out.println("Pending");

    }
}
