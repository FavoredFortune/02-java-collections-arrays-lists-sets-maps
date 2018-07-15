import java.util.ArrayList;
import java.util.List;

public class Roll {
    public static void main(String[] args) {
        //introducing the program to a user with an overview of purpose and expected output
        String greeting = "Welcome to this roll the dice Java program \nthat will roll a 6-sided dice the number of times\nand produce an array with each roll result.\n";
        System.out.println(greeting);
        //call the  roll function with roll value to be sure method works as expected
        roll(30);
    }
    public static List<Integer> roll(int n){

        //create an array to populate with roll values
        List<Integer> rollReturns = new ArrayList<>();

            //keeps track of the number of rolls for the while loop
            int rollCount =0;

            //this while loop uses the helper function "rollHelper" to generate random dice number results
            while (rollCount < n){
                rollReturns.add(rollHelper());
                  //used this to test how the list was being populated with each roll
//                System.out.println(rollReturns);

                // increments the count of rolls to keep the loop going while the conditional statement is true
                rollCount++;
            }
        System.out.println("Here is the array of roll values for " + n + " rolls:");
        System.out.println(rollReturns) ;
        System.out.println("NOTE: When this method works, the last thing you'll see is \n \"Process finished with exit code 0\" (because 0 = true in JAVA).");
        return rollReturns;

    }
    public static int rollHelper(){

       return ((int)(Math.random()*6)+1);
    }
}
