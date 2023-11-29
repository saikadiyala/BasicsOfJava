package basic;

class Inner{
    public void show(){
        System.out.println("In Inner class show()");
    }


}

public class anonymousInner {
    //overriding without creating a class
    //when we need a overridden method to be used only once then this can be used
    public static void main(String[] args) {
        Inner in=new Inner(){
            public void show(){
                System.out.println("In Main class show()");
            }

        };

        in.show();

    }
}
