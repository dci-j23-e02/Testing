import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Main {

  public static void main(String[] args) {

   // List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
    // lambda expression
    // fruits.forEach(element -> System.out.println(element));

   // printNumbers(1);

   // printNumbers(2,3,4,5,6);




   // System.out.println( multiplyMultiple(8,5,2,6));



  }


  public static void printNumbers(double... numbers){
   /* for (double n: numbers) {
      System.out.println(n);
    } */


    // DoubleStream is an interface that holds in a stream of Double values
    // DoubleStream.of is a static method it is used to create a sequential ordered stream from the specified values.
    DoubleStream str = DoubleStream.of(numbers);

    // Using the lambda expression
    str.forEach(element -> System.out.println(element));

    // Using the "::" method reference (  lambda expression  shorthand notation )
    str.forEach(System.out::println);



  }


  public static double multiplyMultiple(double... operands){
    DoubleStream stream = DoubleStream.of(operands);

    double result = stream.reduce(1,(x,y)->x*y);
    /**
     * [8,5,2,6]
     * (identity:1 * 8)->8
     * (8*5)  -> 40
     * (40*2) -> 80
     * (80*6) -> 480
     * */

    return result ;
  }
}
