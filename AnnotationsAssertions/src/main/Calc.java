
/**
 * This class represents a simple calculator that can perform addition of numbers
 * provided in a string format. It is designed to demonstrate exception handling.
 * when negative numbers are encountered
 * */

public class Calc {


  /**
   * Adds the numbers provided in the input string. Negative numbers will cause
   * an IllegalArgumentException to be thrown.
   *
   * @param  numbers A comma-delimited string of numbers to add.
   * @return The sum of the numbers
   * @throws IllegalArgumentException If negative numbers are included in the input
   * */
  public int add (String numbers){
    // If the input string is null or empty, return 0 as there are no numbers to add.
    if(numbers == null || numbers.isEmpty()){
      return  0;
    }

    // " 1 , -2 , 3 , 9 " ->
    // [" 1 "," -2 "," 3 "," 9 "]
    // loop:
    // each element is trimmed : " 1 " -> "1"
    // Integer.parseInt("1") -> 1
    // assigned to the intNumbers[0] = 1
    // process -> [1,2,3,9]:


    // numbers: " 1 , -2 , 3 , 9 "

    //Split the numbers string into an array of strings based on the comma delimiter
    String[] numberArray = numbers.split(",");


    // numberArray: [" 1 "," -2 "," 3 "," 9 "]
    // loop i:   0      1     2     3
    // numberArray[i]: " 1 ", " -2 ", " 3 ", " 9 "
    // numberArray[i].trim(): "1", "-2", "3", "9"
    //Integer.parseInt(numberArray[i].trim()): 1 , -2 , 3, 9

    int sum = 0; // Initialise the sum to 0
    StringBuilder negativeNumbers = new StringBuilder(); // negativeNumbers: to hold the negative numbers if any
    int number=0; // to hold the number in each position of the numberArray
    for (int i = 0; i < numberArray.length; i++) {
        number =  Integer.parseInt(numberArray[i].trim()) ;
        // Check if the number is negative
      if(number < 0){
        negativeNumbers.append(number+",");
      }else{
        // if the number is positive add it to sum
        sum+=number;
      }


    }

    // After processing all numbers, check if there were any negative numbers.

    if(negativeNumbers.length() > 0){
      throw  new IllegalArgumentException("negatives not allowed:["+negativeNumbers.toString()+"]");
    }
    // If there were no negatives encountered
    return sum;
  }

}
