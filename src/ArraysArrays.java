import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArraysArrays {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this lowest average Java program \nthat calculates the" +
                " average value for each array in an array of arrays \nand returns the array with the lowest average";
        System.out.println(greeting);

        //test array of arrays
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        lowestArrayAverage(weeklyMonthTemperatures);
    }

    //primary method for this task
    public static float lowestArrayAverage(int[][] array) {

        int j = 0;
        float lowestAverage = 0;
        while (j > lowestAverage) {

            //invoke helper method from other class
            CalculatingAverages.averageArray(averagesList[j]);

            //test print to see if list is populating with new averages on each loop and ending appropriately
            System.out.println(averagesList);
            j++;
        }
        return lowestAverage;
    }

    //using principles from the list creation used in the Roll class - generating a new array of averages of the
    // inner arrays in the primary outer array
    public static List<Integer> arrayOfAverages(int[][] array) {

        //create an array to populate with roll values
        List<Integer> averagesList = new ArrayList<>();

        //track through indicies of arrays within input outer array
        for (int i = 0; i < array.length; i++) {
            averagesList.add = CalculatingAverages.averageArray(array[i]);
        }
    } return averagesList;
}
