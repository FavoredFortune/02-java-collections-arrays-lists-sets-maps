import java.util.ArrayList;
import java.util.List;

public class ArraysArrays {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this lowest average Java program \nthat calculates the" +
                " average value for each array in an array of arrays \nand returns the array with the lowest average" +
                ".\n";
        System.out.println(greeting);

        //test array of arrays
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        float lowestAverage =  lowestArrayAverage(weeklyMonthTemperatures);
        System.out.println("The lowest average the values stored in the outer array is: \n" + lowestAverage + "\n");
    }

    //primary method for this task
    public static float lowestArrayAverage(int[][] array) {

        //call helper method to create array of each row's average
        int [] averageArray  = arrayOfAverages(array);
        float lowestAverage = 0;
        for(int i = 0; i<averageArray.length; i++) {

           lowestAverage = averageArray[i];

            //test print to see if list is populating with new averages on each loop and ending appropriately
//            System.out.println(averageArray);
        }
        return lowestAverage;
    }

    //using principles from the list creation used in the Roll class - generating a new array of averages of the
    // inner arrays in the primary outer array
    public static int[] arrayOfAverages(int[][] array) {

        //create an array to populate with roll values
        List<Integer> averagesList = new ArrayList<>();

        //track through indicies of arrays within input outer array
        for (int i = 0; i < array.length; i++) {
            //store average value for an element temporarily before adding to the new list.
            int averageElement = (int)CalculatingAverages.averageArray(array[i]);
            averagesList.add(averageElement);
        }
        //call method from other class as a helper function for this class
       int[] results = ArraysArrays.averagesArray(averagesList);
        return results;
    }

    //helper function to convert list to array
    //help from stackOverflow to turn an Array List of Integers into an int array
    //https://stackoverflow.com/questions/960431/how-to-convert-listinteger-to-int-in-java
    private static  int[] averagesArray(List<Integer> averagesList){
        int[] results = new int[averagesList.size()];
        for(int i = 0;i < results.length;i++)
            results[i] = averagesList.get(i);
        return results;
    }
}
