import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
    // Group many assertions and every assertion is executed even if one or more of them fails
    assertAll(
        // assertEquals Fails when expected does not match actual ( actual returned value by the method )
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


  @Test
  @DisplayName("user name validation")
  void validateUsername() {
    Calculator c1 = new Calculator("Jan", "jan123@xmail.com");
    assertEquals(false, c1.validateUsername());
  }

  @Test
  void testAssertFalse(){
    Calculator c1 = new Calculator("Jan", "jan123@xmail.com");

    // assertEquals(false, c1.validateUsername());

    // Fails when expression is not false
    // c1 username length is not greater than 6 :
    assertFalse(c1.getUserName().length() > 6); // passed

    Calculator c2 = new Calculator("Terissa", "teri123@xmail.com");
    // c2 username length is not less than 6 :
    assertFalse(c2.getUserName().length() < 6 ); // passed
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