import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GoldFishTest {

@ParameterizedTest
@MethodSource("provideFishes")
  public void myTest(GoldFish fish){
 // assertEquals(1, fish.getAge());
  assertTrue(fish.getAge() >= 1);
}

private static Stream<Arguments> provideFishes(){
  return  Stream.of(
      Arguments.of(new GoldFish("Nemo", 1)),
      Arguments.of(new GoldFish("Browny", 2))
  );
}


}