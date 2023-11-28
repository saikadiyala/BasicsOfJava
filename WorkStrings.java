public class WorkStrings {

    public static void main(String[] args) {
        String s=new String("des");
        System.out.println("hello "+ s);
        System.out.println(s.concat(" hello"));
        System.out.println(s.hashCode());
        System.out.println(s.charAt(0));
        System.out.println(s.length());

        String s1="sam";
        s1= s1+" mii"; //Another area of memory is created for sam mi , the address will be changed.
        //original sam will be deleted in garbage collection.
        System.out.println(s1);
        System.out.println("--------------------------");
        // == checks the address for strings
        String k1=new String("sai");
        String k2=new String("sai");
        System.out.println(k1==k2);  // this creates two different objects
        String m1="nav"; //stored in string literal pool
        String m2="nav";
        System.out.println(m1==m2); //this wont create two different objects, so both address are same
        System.out.println(k1==m1);
        System.out.println(m1.hashCode()==m2.hashCode());

        System.out.println("----String Buffer--------");
        StringBuffer sb=new StringBuffer("qwert");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append(" asdf");
        System.out.println(sb);

        String str= sb.toString(); //string buffer can be changed to string



    }
}
