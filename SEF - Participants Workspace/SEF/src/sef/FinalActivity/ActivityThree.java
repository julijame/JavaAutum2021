package sef.FinalActivity;

public class ActivityThree {

    public static void main(String[] args) {
       int [] arr = {0,34,25,1,7};
       int index = 10;
       try{
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Don't have such element number " + index + " in the array");
            System.out.println(e.getMessage());
        }

    }
}
