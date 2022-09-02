package oop.encaplulationAndpolymorphism;

////This is an exercise in Class Composition. To complete the exercise, you must create five classes with associated member variables and methods.
////
////The five classes should be created as follows:
// Create a class with the name Wall.
// It contains one member variable, direction, and is of type String.
// A constructor for Wall should accept one parameter for the member variable direction. A getter should also be defined for the direction field called getDirection().
public class Wall {

  private String direction;

  public Wall(String direction) {
    this.direction = direction;
  }

  public String getDirection() {
    return direction;
  }
}
