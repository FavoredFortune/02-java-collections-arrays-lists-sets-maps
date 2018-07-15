import java.util.Arrays;
import java.util.Set;
public class ContainsDuplicates {

    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this duplicate array identifier Java program \nthat will return a statement of true if the arrays have duplicate values.\nIf yes, the program will deliver a false. if there are now duplicates it will deliver true.\n";
        System.out.println(greeting);

        //arrays to test program
        int[] array1 = {1, 2, 3, 7}; //expected answer is false
        int[] array2 = {10, 3, 3, 44}; //expected answer is true

        //change array variable in the method invocation below to test for both true and false outcomes
        duplicates(array2);

    }
    public static boolean duplicates(int[] array){
        boolean answer = false;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length - 1; j++) {
                if (array[i] == (array[j])) {
                    answer = true;
                    System.out.println(answer);
                    return answer;

                }i++;
            }
        }   System.out.println(answer);
            return answer;
    }
}