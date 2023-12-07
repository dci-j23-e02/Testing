import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class GoldFishTest {

@ParameterizedTest
@MethodSource("provideFishes")
  public void ageTest(GoldFish fish){
 // assertEquals(1, fish.getAge());
  assertTrue(fish.getAge() >= 1);
}


  @ParameterizedTest
  @ValueSource(strings = {"nemo", "neo"})
  void checkLengthOfName(String name){

  assertTrue(name.length() > 3);
  }


  @ParameterizedTest
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