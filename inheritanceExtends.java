public class inheritanceExtends extends inheritance{

    //this can access everything in ineritance class except private vals
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }


    //Even though the parent has same method , we can create same method in child class if necessary
    //this is called as method overriding
    public int add(int n1,int n2){
        return n1-n2;
    }

}
