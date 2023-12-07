public class GoldFish {
  private String name;
  private int age;

  public int calculateSpeed(){
    if(age == 0){
      throw new RuntimeException("This will fail :((");
    }

    return 10 / age;
  }


  public GoldFish(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "GoldFish{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
