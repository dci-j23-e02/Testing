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


  public static double multiply(double x, double y){
    return x*y ;
  }


  @Override
  public String toString() {
    return "Calculator{}";
  }
}
