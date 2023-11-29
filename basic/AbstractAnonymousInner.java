package basic;

// when we there is 1 usage of methods

abstract class AbsInner{
    public abstract void show();
    public abstract void config();
}

public class AbstractAnonymousInner {
    public static void main(String[] args) {
        AbsInner abs=new AbsInner() {
            @Override
            public void show() {
                System.out.println("In inner class");
            }

            @Override
            public void config() {
                System.out.println("In config inner");
            }
        };
        abs.config();
        abs.show();
    }
}
