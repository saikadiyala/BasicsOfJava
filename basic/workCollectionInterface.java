package basic;

// working with collection interface

import java.util.*;

class Stu implements Comparable<Stu>{
    public String name;
    public int marks;
    public Stu(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compareTo(Stu that) {
        if(this.marks>that.marks)
            return 1;
        else
            return -1;
    }
}

public class workCollectionInterface {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add('a'); //here it is treating a,8, everything as objects
        c.add(8);
        c.add(10);
        c.add(10.5);
        System.out.println(c);// collection can be directly printed //[8,10]
        for (Object n : c) {
            System.out.println(n);
        }

        //to mention the type we need to use generics
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(10);
        c1.add(20);
        System.out.println(c1);
        Iterator it1 = c1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        //List interface extends collection interface, ArrayList implements List interface
        List<Integer> c2 = new ArrayList<>();
        c2.add(100);
        c2.add(200);
        c2.add(200);
        c2.add(100);

        System.out.println(c2);
        System.out.println(c2.get(1));

        //List allows duplicates, whereas set won't allow
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(10);
        s.add(20);

        System.out.println(s); //cannot have duplicates, doesn't give in a sequence order, set don't have index


        //TreeSet( ) follows the sorted order
        Set<Integer> s1 = new TreeSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(10);
        s1.add(20);

        System.out.println(s1);

        //iterator() is used to iterate over a collection
        Iterator it = s1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Map is a part of Collection API
        //Map is an interface
        //Map supports key,value pair
        //HashMap is a class which implements Map interface
        Map<Integer, String> Students = new HashMap<>();
        Students.put(0, "SAM");
        Students.put(1, "IOP");
        Students.put(2, "QWE");

        System.out.println(Students);
        System.out.println(Students.get(0));
        //keys are unique
        Students.put(0, "SODHI"); //put replaces the value for existing key
        System.out.println(Students);
        //null keys are allowed
        Students.put(null, "JAM");
        System.out.println(Students);
        //null values are allowed
        Students.put(0, null);
        System.out.println(Students);
        Students.put(null, "GYM");
        System.out.println(Students);
        Students.put(1, null);
        System.out.println(Students);

        System.out.println(Students.keySet());
        for (Integer i : Students.keySet()) {
            System.out.println(i + " " + Students.get(i));
        }


        // sorting the collection using Collections class
        List<Integer> c3 = new ArrayList<>();
        c3.add(91);
        c3.add(13);
        c3.add(20);
        c3.add(0);

        Collections.sort(c3);
        System.out.println(c3);

        // We can sort using own sort program
        //using Comparator
        //Suppose what if we want to sort based on the last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) //o1 and o2 are the array values ex:o1=90 and o2=10
                    return 1; //wont sort
                else
                    return -1; //sorts the values
            }
        };

        List<Integer> c4 = new ArrayList<>();
        c4.add(91);
        c4.add(13);
        c4.add(20);
        c4.add(0);

        Collections.sort(c4, com);
        System.out.println("---using Comparator----");
        System.out.println(c4);


        //Another Example

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length())
                    return 1; //Won't sort
                else
                    return -1; //if length is less then sorts
            }
        };

        List<String> ll = new ArrayList<>();
        ll.add("SAM");
        ll.add("qwerty");
        ll.add("a");
        ll.add("asd");

        //sort
        Collections.sort(ll);
        System.out.println(ll);

        //sorting using the length of strings
        Collections.sort(ll, comp);
        System.out.println("---Sort using Comparator------");
        System.out.println(ll);


        //Array list of students object

        //To perform soring based on the marks

        System.out.println("----ArrayList of Student Objects--------");

       Comparator<Stu> compar=new Comparator<Stu>() {
           @Override
           public int compare(Stu o1, Stu o2) {
               if(o1.marks>o2.marks)
                   return 1;
               else
                   return -1;
           }
       };

        List<Stu> student=new ArrayList<>();
        student.add(new Stu("john",100));
        student.add(new Stu("mark",50));
        student.add(new Stu("some",200));
        student.add(new Stu("henry",80));

        System.out.println("------ArrayList of Objects-----");
        System.out.println(student);
        //without compar sort won't work because student belongs to Stud class , which doesn't implement Comparabale
        //so if we implement Comparable without compar we can sort.
        //Collections.sort(student, compar);
        Collections.sort(student); //This will work because Stud implements Comparable
        System.out.println("------Sorted ArrayList---------");
        System.out.println(student);

    }


}
