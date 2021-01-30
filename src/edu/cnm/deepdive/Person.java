package edu.cnm.deepdive;

public class Person {

  private String firstName;
  private String lastName;

  public Person(){
    this("Eric", "Johnson");//will call the second constructor.
  }

  public Person(String firstName, String last) {
    this.firstName = firstName;
    lastName = last;// can also be typed as this.lastName = last but not needed as no confusion.
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public static void main(String[] args) {
    Person person1 = new Person();
    System.out.println(person1.getFullName());
  }

}
