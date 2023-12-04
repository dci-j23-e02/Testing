import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  @DisplayName("Add two numbers")
  void add() {
    System.out.println("**--- Test method add is executed ---**");
    assertEquals(1, Calculator.add(0,0));
  }

  @Test
  void multiply() {
  }
}