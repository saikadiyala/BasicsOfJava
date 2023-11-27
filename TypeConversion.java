public class TypeConversion {
    public static void main(String[] args) {

      //  Implicit conversion is automatic conversion
        // Emplicit conversion is Typecasting
        //byte b=127;
        //System.out.println(b);
        int a=257;
        System.out.println(a);
        //for a bigger data type to fit in smaller data type casting is needed
        //byte can accept only from -127 to 128, if the conversion value is larger then
        //module is performed, here 257%256 is performed , bcs byte contains total of 256 numbers
        byte k=(byte) a;
        System.out.println(k); //1

        float f=5.6f; //f is needed bcs default is double
        int t=(int) f; // there will be loss of value in conversion from float to int //5
        System.out.println(t);


    }
}
