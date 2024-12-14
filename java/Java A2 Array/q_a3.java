

/*
3)Sum of Elements: Implement a Java function that calculates the sum of all elements in an integer array.
  For instance, given the array [1, 2, 3, 4], the output should be 10.
*/
import java.util.Arrays;
import java.util.Scanner;
public class q_a3 {
    public static int[] make_array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] new_array = new int[size];
        for(int a = 0; a <= size-1; a++){
            System.out.println("Enter the "+(a+1)+" Element");
            new_array[a] = sc.nextInt();
        }
        return new_array;
    }

    public static void sum_array(int[] new_array){
        int sum = 0;
        for (int j : new_array) {
            sum = sum + j;
        }
        System.out.println("The sum of Array is "+sum);

    }

    public static void main(String[] args){
        int [] new_array = make_array();
        sum_array(new_array);

    }
}
