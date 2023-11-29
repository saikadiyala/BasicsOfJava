package basic;

import java.util.Objects;

public class workObject {
    public String model;
   public String price;

  // overriding the orginal toString()
//   public String toString(){
//       return "Hey";
//   }

    @Override
    public String toString() {
        return "workObject{" +
                "model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        workObject that = (workObject) o;
        return Objects.equals(model, that.model) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
    //overriding equals() of Object class , to check whether
    //the object contents are equal or not

//    public boolean equals(workObject that){
//      //equals() used below is a method from String class
//      return (this.model.equals(that.model)) && (this.price.equals(that.price));
//   }

}
