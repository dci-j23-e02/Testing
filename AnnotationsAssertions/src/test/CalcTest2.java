import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CalcTest2 {
 private  Calc calculator = new Calc();


@Test
public  void add() {
  IllegalArgumentException exception = assertThrows(
      IllegalArgumentException.class,
      ()->{
    calculator.add("1,-2,3");
  }
  );

  assertEquals("negatives not allowed:[-2,]",exception.getMessage());
// exception.printStackTrace();

  }
}