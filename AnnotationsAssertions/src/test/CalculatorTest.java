import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CalculatorTest {
  private Calculator c1 = new Calculator("Jan");
  private  Calculator c2 = new Calculator("Terissa", "teri123@xmail.com");

  @Test
  @DisplayName("Add two numbers")
  void testAdd() {
    System.out.println("**--- Test method add is executed ---**");
    // Group many assertions and every assertion is executed even if one or more of them fails
    assertAll(
        // assertEquals Fails when expected does not match actual ( actual returned value by the method )
        () -> assertEquals(5, Calculator.add(3,2)), // passed
        () -> assertEquals(1, Calculator.add(0,0)),
        () -> assertEquals(0, Calculator.add(-2,2)),
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
    assertEquals(false, c1.validateUsername(), "username length must be  greater than 6");
  }

  @Test
  void testAssertFalse(){
    Calculator c1 = new Calculator("Jan", "jan123@xmail.com");
    Calculator c2 = new Calculator("Terissa", "teri123@xmail.com");

    assertAll(

        // assertEquals(false, c1.validateUsername());

        // Fails when expression is not false
        // c1 username length   must be not less than 6 :
        ()-> assertFalse(c1.getUserName().length() < 6, "Testing c1 assertFalse line 59 : username length   must be not less than 6"),// fail


    // c2 username length is not less than 6 :
        ()-> assertFalse(c2.getUserName().length() < 6, "username length   must be not less than 6" ),// passed


    // AssertTrue : Fails when the expression is not True
    // c1 username length must be  greater than 6 :
        ()-> assertTrue(c1.getUserName().length() > 6, "username length must be  greater than 6"), // fail



    // c2 username length must be greater than 6 :
        ()-> assertTrue(c2.getUserName().length() > 6 , "username length must be  greater than 6") // passed



    );

  }

@Test
void testAssertNull(){
    // AssetNull fail when the actual is not null
  Calculator c1 = new Calculator("Jan");
  Calculator c2 = new Calculator("Terissa", "teri123@xmail.com");
  assertNull(c1.getEmailAddress(), "getEmailAddress must return null "); // pass
  assertNull(c2.getEmailAddress(), "getEmailAddress must return null "); // fail
}

@Test
void testAssertNotNull(){
  // AssetNotNull fail when the actual is null
  Calculator c1 = new Calculator("Jan");
  Calculator c2 = new Calculator("Terissa", "teri123@xmail.com");
  assertNotNull(c1.getEmailAddress(), "c1 fail : getEmailAddress must not return null "); // fail
  assertNotNull(c2.getEmailAddress(), "getEmailAddress must not return null "); // pass
}

  @Test
  void testAssumeTrue(){
    boolean assume = 'A' == 'A';
    System.out.println(System.getProperty("os.name"));
    assumeTrue(assume);
    assertEquals("Hello", "Hello");
  }

  @Test
  void testOnMac(){
    assumeTrue(System.getProperty("os.name").equals("Windows")); // Mac OS X
    assertEquals("Hello", "Hello");


  }

  @Test
  void testNotOnWindows(){
    assumeFalse(System.getProperty("os.name").equals("Windows"));
    assertEquals("Hello", "Hello");
  }



  @Test
  void testAssumingThat(){
    // the test in the lambda expression will run either way , the assumption is true or false
    System.setProperty("env", "test");
    //System.out.println(System.getProperty("env"));
    assumingThat("test".equals(System.getProperty("env")),
        () -> {
          assertEquals("9", "10");
          System.out.println("test performed assumingThat we are on test env");
        }
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