public class WeatherData {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this lowest average Java program \nthat calculates the" +
                " average value for each array in an array of arrays \nand returns the array with the lowest average" +
                ".\n";
        System.out.println(greeting);

        //test array of arrays
        int[][] weeklyOctTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
    }
}
