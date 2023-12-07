import java.util.stream.DoubleStream;

public class Calculator {

  private String userName;
  private String emailAddress;


  public Calculator(String userName, String emailAddress) {
    this.userName = userName;
    this.emailAddress = emailAddress;
  }

  public Calculator(String userName) {
    this.userName = userName;

  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public boolean validateUsername() {
    return userName.length() > 6;
  }


public static double add(double x, double y){
  if(x == 0 && y == 0){
    return 1;
  }
  return x+y ;
}


  public static double addMultiple(double... operands){
   /* DoubleStream stream = DoubleStream.of(operands);
    double result =  stream.sum();
    return result; */
    return DoubleStream.of(operands).sum();

  }


  public static double multiplyMultiple(double... operands){
  // DoubleStream stream = DoubleStream.of(operands);

   // double result = stream.reduce(1,(x,y)->x*y);
    /**
     * [8,5,2,6]
     * (identity:1 * 8)->8
     * (8*5)  -> 40
     * (40*2) -> 80
     * (80*6) -> 480
     * */
    // return result;
   // return stream.reduce(1,(x,y)->x*y);
   return DoubleStream.of(operands).reduce(1,(x,y)->x*y);
  }


  public static double multiply(double x, double y){
    return x*y ;
  }


  @Override
  public String toString() {
    return "Calculator{" +
        "userName='" + userName + '\'' +
        ", emailAddress='" + emailAddress + '\'' +
        '}';
  }
}
