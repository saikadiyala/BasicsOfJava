public class arrayMain {
    public static void main(String[] args) {

        array a=new array();
        a.work();
        System.out.println("END");

        array a1=new array();
        a1.marks=200;
        a1.name="IOS";

        array a2=new array();
        a2.marks=300;
        a2.name="sjdj";

        array a3=new array();
        a3.marks=400;
        a3.name="jdcjd";

        //Array of student class
        array students[]=new array[3];
        students[0]=a1;
        students[1]=a2;
        students[2]=a3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+ " "+ students[i].marks);
        }

        //Enhanced For loop
        System.out.println("ENHANCED");
        for(array s: students){
            System.out.println(s.name+ " "+ s.marks);
        }

    }
}
