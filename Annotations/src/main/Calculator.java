public class Calculator {

public static double add(double x, double y){
  if(x == 0 && y == 0){
    return 1;
  }
  return x+y ;
}


  public static double multiply(double x, double y){
    return x*y ;
  }


  @Override
  public String toString() {
    return "Calculator{}";
  }
}
