/*1)Find Duplicates in an Array: Given an integer array where each element appears once or twice,
write a function that returns an array of all the duplicates
.For example, given the array [4, 3, 2, 7, 8, 3, 2, 1], the output should be [3, 2].*/


import java.util.Arrays;
import java.util.Scanner;

public class q_a1 {

    public static void duplicates(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] new_array = new int[size];
        System.out.println("Enter the number: ");
        for(int a = 0; a <= size-1; a++){
            new_array[a] = sc.nextInt();
        }

        int[] temp_array = Arrays.stream(new_array).sorted().toArray();
        int[] result_array = new int[size];

        for(int i = 0; i < size-1; i++){
            if (temp_array[i] == temp_array[i+1])
                System.out.println(temp_array[i]);
        }
    }

    public static void main(String[] args){
        duplicates();

    }
}
