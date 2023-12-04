import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  @DisplayName("Add two numbers")
  void add() {
    System.out.println("**--- Test method add is executed ---**");
    assertAll(
        () -> assertEquals(5, Calculator.add(3,2)),
        () -> assertEquals(1, Calculator.add(0,0)),
        () -> assertEquals(4, Calculator.add(2,2)),
        () -> assertEquals(2, Calculator.add(0,2))
    );
  }

  @Test
  void multiply() {
    assertAll(
        () -> assertEquals(4, Calculator.multiply(2,2)),
        () -> assertEquals(-4, Calculator.multiply(2,-2)),
        () -> assertEquals(4, Calculator.multiply(-2,-2)),
        () -> assertEquals(0, Calculator.multiply(0,2))
    );
  }
}