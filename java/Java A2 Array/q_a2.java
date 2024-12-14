/*
2) Find the Kth Largest Element: Write a Java method to find the kth largest element in an unsorted array.
   For instance, given the array [3, 2, 1, 5, 6, 4] and k = 2, the output should be 5.
*/


import java.util.Arrays;
import java.util.Scanner;

public class q_a2 {
    public static void k_element(int[] input){
        int[] sorted_input = Arrays.stream(input).sorted().toArray();
        int length = sorted_input.length;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Kth Largest Element You want to find: ");
        int k = s.nextInt();
        if(length > k)
            System.out.println("The "+k+"th largest number is "+sorted_input[length - k]);
        else
            System.out.println("K exceeds Array size");

    }

    public static void main(String[] args){
        int[] input = {2,5,4,3,6,1,7,9,18};
        k_element(input);

    }

}
