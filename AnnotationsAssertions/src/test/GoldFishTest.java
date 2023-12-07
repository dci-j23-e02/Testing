import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class GoldFishTest {

  /* @ParameterizedTest` is an annotation in JUnit 5 that
    signifies that the method it is annotating is a parameterized test.  */
@ParameterizedTest
/*
* `@MethodSource` is an annotation used in conjunction with `@ParameterizedTest`
* in JUnit 5. It allows you to reference one or more methods of the test class
* to supply the parameters for each invocation of the parameterized test.

The methods that are referenced by `@MethodSource` must be static and
* must return either a `Stream`, an `Iterable`, an `Iterator`, or an array.
* Each object provided by the stream, iterable, iterator, or array
* will be used as the parameters for a single invocation
* of the parameterized test.
* */
@MethodSource("provideFishes")
  public void ageTest(GoldFish fish){
 // assertEquals(1, fish.getAge());
  assertTrue(fish.getAge() >= 1);
}



  @ParameterizedTest
  /*
  * `@ValueSource` is an annotation used in JUnit 5 for parameterized tests. It allows you to
  * specify an array of literal values which will be used as arguments for the parameterized test.

The `@ValueSource` annotation can provide arrays of simple literals for types
* like `int`, `long`, `String`, `double` and `Class`.
  * */

  @ValueSource(strings = {"nemo", "neo"})
  void checkLengthOfName(String name){

  assertTrue(name.length() > 3);
  }


  @ParameterizedTest
  /*
    * @CsvSource` is an annotation used in JUnit 5 for parameterized tests. It allows you to
    * specify an array of comma-separated values (CSV) which will be used as arguments for the
    * parameterized test.

   Each string in the `@CsvSource` annotation represents a single invocation of the parameterized
   *  test,  and the comma-separated values in each string will be the arguments for that invocation.
    * */

  @CsvSource({"2, even", "3, odd"})
  void checkEvenNumbers(int number, String expected){
  int evenOrOdd = 0;
    if(expected.equals("even") == true) {
      evenOrOdd = 0;
           }else{
      evenOrOdd = 1;
           }

    assertEquals(evenOrOdd, number % 2);
  /*
  assertEquals(
      expected.equals("even") ? 0: 1, number % 2

  );*/
  }
/**
 * expected.equals("even") ? 0: 1,
 *
 * if(expected.equals("even") == true) {
 *   return 0
 * }else{
 *   return 1
 * }
 *
 * */

@ParameterizedTest
/**
 * `@CsvFileSource` is an annotation used in JUnit 5 for parameterized tests. It allows you to
 * specify a CSV file from which the test data will be loaded. Each line in the CSV file will be
 * used as arguments for a single invocation of the parameterized test.
 *
 * The CSV file should be a classpath resource, and its path should be relative to the class in
 * which the parameterized test is defined.
 * */
@CsvFileSource(
    files = "AnnotationsAssertions/src/test/resources/csv-file-source.csv",
    numLinesToSkip = 1
)
void checkEvenNumbersCsvFile(int number, String expected){

  assertEquals(
      expected.equals("even") ? 0: 1, number % 2

  );
}





private static Stream<Arguments> provideFishes(){
  return  Stream.of(
      Arguments.of(new GoldFish("Nemo", 1)),
      Arguments.of(new GoldFish("Browny", 2))
  );
}


}