package basic;
enum Laptop{
    Macbook(2000),Samsung(1500),IBM;

    private int price;

    Laptop() {
        this.price=500;
    }
    Laptop(int price) {
        this.price=price;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class WorkingEnumTwo {
    public static void main(String[] args) {
        Laptop l=Laptop.Macbook;
        System.out.println(l.getPrice());

        Laptop.IBM.setPrice(2800);

        for(Laptop l1:Laptop.values()){
            System.out.println(l1+" "+l1.getPrice());
        }
    }
}

