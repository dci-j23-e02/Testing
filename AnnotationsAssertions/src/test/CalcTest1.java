import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest1 {
private  Calc calculator = new Calc();


  @Test
 public void add() {
    try {
      calculator.add(" 1 , -2 , 3 , -9 ");
      fail("Should throw an exception if one or more of given numbers are negative");
    }catch (IllegalArgumentException e){
      assertEquals("negatives not allowed:[-2,-9,]",e.getMessage() );
    }
  }
}