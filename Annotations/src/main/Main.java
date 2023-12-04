import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
    // lambda expression
    fruits.forEach(element -> System.out.println(element));


  }
}
