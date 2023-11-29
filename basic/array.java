package basic;
public class array {

    String name;
    int marks;
    public void work(){
        int a[]=new int[4];
        a[0]=1;
        a[1]=2;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //Enhanced for
        for(int m:a){
            System.out.println(m);
        }

        int b[][]=new int[3][4];
        for(int j=0;j<3;j++){
            for(int k=0;k<4;k++){
                b[j][k]=(int) (Math.random()*100);
            }
        }

        for(int j=0;j<3;j++){
            for(int k=0;k<4;k++){
                System.out.print(b[j][k]+" ");
            }
            System.out.println();
        }

        //Enhanced for
        for(int s[]: b){
            for(int z:s){
                System.out.println(z);
            }
        }

        //Jagged Arrays
        int nums[][]=new int[3][];
        nums[0]=new int[3];
        nums[1]=new int[2];
        nums[2]=new int[4];
        for(int q=0;q<nums.length;q++){
            for(int w=0;w<nums[q].length;w++){
                nums[q][w]=(int) (Math.random()*100);
            }
        }

        for(int q=0;q<nums.length;q++){
            for(int w=0;w<nums[q].length;w++){
                System.out.print(nums[q][w]+" ");
            }
            System.out.println();
        }

    }

}
