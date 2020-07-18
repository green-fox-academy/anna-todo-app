package demo;

public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void washingHands() {
    System.out.println(name + " washed his hands.");
  }

}
