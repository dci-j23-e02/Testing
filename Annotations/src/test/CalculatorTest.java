import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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
  @DisplayName("Multiply two numbers")
  void multiply() {
    System.out.println("**--- Test method Multiply is executed ---**");
    assertAll(
        () -> assertEquals(4, Calculator.multiply(2,2)),
        () -> assertEquals(-4, Calculator.multiply(2,-2)),
        () -> assertEquals(4, Calculator.multiply(-2,-2)),
        () -> assertEquals(0, Calculator.multiply(0,2))
    );
  }

  @AfterAll
  static void done(){
    System.out.println("cleaning of the setup ");
  }

  @BeforeAll
  static void setup(){
    System.out.println("setup the test");
  }

  @BeforeEach
  void initialize(){
    System.out.println("initialize specific data / instances before each test method");
  }

  @AfterEach
  void tearDown(){
    System.out.println("cleaning up initialized data / instances after each test method");
  }
}