/*
4)Count Even and Odd Numbers: Write a Java method that counts the number of even and odd integers in an array.
For example, for the array [1, 2, 3, 4, 5], the output should be Even Count: 2, Odd Count: 3.
*/

public class q_a4 {

    public static void even_odd(int[] array){
       int even = 0;
       int odd = 0;
        for( int i : array) {
            if (i % 2 == 0)
                even = even + 1;
            else
                odd = odd + 1;
        }
        System.out.println("Event Count: "+even);
        System.out.println("Odd Count: "+odd);
    }

    public static void main(String[] args){
        int [] array = q_a3.make_array();
        even_odd(array);

    }
}
