import java.util.Arrays;

public class q_a5 {

    public static void rev_array(int[] array){
        int len = array.length;
        int j = 0;
        int[] rev_array = new int[len];
        for (int i = (len-1); i >=0; i--){
            rev_array[j] = array[i];
            j = j+1;
        }
        System.out.println("The Reverse Array is:  " + Arrays.toString(rev_array));
    }

    public static void main(String[] args){
        int[] array = q_a3.make_array();
        System.out.println("The Array is: "+ Arrays.toString(array));
        rev_array(array);
    }
}
