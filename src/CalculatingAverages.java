import java.util.Arrays;

public class CalculatingAverages {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this average calculating Java program \nthat takes the averages of all integers" +
                " in an array, \nwhere all the integers are always positive values. \n";
        System.out.println(greeting);

        //arrays to test program
        int[] array1 = {1, 2, 3, 7}; //expected answer is 2.5
        int[] array2 = {22,11,23}; //expected answer is 28

        //change array variable in the method invocation below, as well as println to test for different results
        System.out.println("The array that will be used to calculate the average value of all elements (known to be " +
                "positive) is: \n" + Arrays.toString(array2) + "\n");

        averageArray(array2);
    }
    public static float averageArray(int[] array){

        float  averageValue;
        int totalValue = 0;
        int arraySize = array.length;
        for (int index = 0 ; index < arraySize; index++){

            //adding one element from the array to the rest
            totalValue += array[index];

            //test totaling
//          System.out.println(totalValue);
        }
        averageValue = totalValue/arraySize;

        System.out.println("The average of the values stored in the array is: \n" + averageValue + "\n") ;

        System.out.println("NOTE: When this method works, the last thing you'll see is \n \"Process finished with " +
                "exit  code 0\" (because 0 = true in JAVA).");
        return averageValue;

    }
}
