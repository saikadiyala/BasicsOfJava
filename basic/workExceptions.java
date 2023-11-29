package basic;

public class workExceptions {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int nums[] = new int[5];
        try {
            j = j / i;//whenever it finds an exception it moves to catch block
            if (j == 0) {
                throw new ArithmeticException("j is zero");
            }
            System.out.println(nums[0]);
         //   if(nums.length==5) return;
            System.out.println(nums[5]); //until and unless it finds an exception
            //it computes the statements and those values will be updated.
        } catch (ArithmeticException e) {
            j = 1;
            System.out.println("cannot divide by zero");
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("array is out");
            System.out.println(e1);
        } catch (Exception e) {
            System.out.println(e);
        }
        //irrespective of above these are executed.
        finally {
            System.out.println(j);
            System.out.println("Bye");
        }
    }
}
