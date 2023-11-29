package basic;

public class InheritanceMain {
    public static void main(String[] args) {

        inheritanceExtends ix=new inheritanceExtends();
        int r1=ix.add(1,2);//method overriding
        int r2=ix.sub(3,2);
        int r3=ix.multi(1,2);
        int r4=ix.div(2,1);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}
