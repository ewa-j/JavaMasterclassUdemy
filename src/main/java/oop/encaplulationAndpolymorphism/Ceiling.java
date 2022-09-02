package oop.encaplulationAndpolymorphism;

//This is an exercise in Class Composition. To complete the exercise, you must create five classes with associated member variables and methods.
//
//The five classes should be created as follows:

//3) Create a class with the name Ceiling.
// There are two member variables for this one, height and paintedColor, both of type int.
// There should also be a constructor which accepts both member variables as parameters.
// There are also two additional methods which should be defined:
// getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.

public class Ceiling {

  private int height;
  private int paintedColor;

  public Ceiling(int height, int paintedColor) {
    this.height = height;
    this.paintedColor = paintedColor;
  }

  public int getHeight() {
    return height;
  }

  public int getPaintedColor() {
    return paintedColor;
  }
}
