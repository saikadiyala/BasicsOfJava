package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class workStreamsAPI {
    public static void main(String[] args) {

        List<Integer> str= Arrays.asList(4,2,3,4); //Creates a list same like new ArrayList() and then add values
        int sum=0;

        for(Integer n: str){
            n=n*2;
            sum=sum+n;
        }
       // System.out.println(sum);

        //underlying working of forEach()
        //Consumer Interface
        //forEach takes Consumer interface
        //accept is the method, for each element of the list, action is performed
       /*
       Consumer<Integer> c=new Consumer<Integer>() {

            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        str.forEach(c);

        */

        //can use for , enhanced for loop, forEach to iterate over a list
      //  str.forEach(n-> System.out.println(n));


        // using stream , stream is an interface
        List<Integer> nums= Arrays.asList(4,2,3,4);
        Stream<Integer> s1=nums.stream(); // this is a stream, it doesn't affect nums

        //Internally filter takes Predicate interface which implements test function
        /*
        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if(n%2==0)
                    return true;
                else
                    return false;
            }
        };

         */
        // ABove can be modified to lambda as Predicate is a functional interface
      //  Predicate<Integer> p=(Integer n)->n%2==0 ;
       // Predicate<Integer> p=(n)->n%2==0 ;
     //   Stream<Integer> s2=s1.filter(p);
        Stream<Integer> s2=s1.filter(n->n%2==0);
     //   s2.forEach(n-> System.out.println(n));

        Stream<Integer> s3=s2.map(n-> n*2);
        //s3.forEach(n-> System.out.println(n));
        //e initially zero, then output of c+e will be stored in e
        int res=  s3.reduce(0,(c,e)->c+e);
        System.out.println(res);

        //can use stream only once
       // s1.forEach(n-> System.out.println(n));
       //  s1.forEach(n-> System.out.println(n)); //this gives an error as we have already used once
       // System.out.println(s1.count()); this also gives error bcs cannot use more than once


    }
}
