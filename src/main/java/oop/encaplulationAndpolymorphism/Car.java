package oop.encaplulationAndpolymorphism;

//For this exercise you will create four classes of vehicles. The first class should be named Car.
// This will be the base class for three other classes, Mitsubishi, Holden, and Ford.
//
//The first class contains four member variables, or fields, with these names and conditions:
//
//engine of type boolean
//cylinders of type int
//name of type String
//wheels of type int
//All four member variables should have private access.
//
//The constructor should accept two parameters, cylinders and name. Also, all of these cars have an engine and four wheels. So the other two fields should be set to default values.
//
//In addition, there are five other methods These methods should be defined as described below:
//startEngine accepts no parameters and returns a message which says that the car's engine is starting.
//accelerate accepts no parameters and returns a message that says the car is accelerating.
//brake accepts no parameters and returns a message stating the car is braking.
//The messages these methods return should somewhere contain the name of the class, Car.
//
//Two getter methods should also be defined here for the member variables cylinders and name. All methods have public access
public class Car {

  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.engine = true;
    this.wheels = 4;
  }

  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  public String accelerate() {
    return getClass().getName() + " -> accelerate()";
  }

  public String brake() {
    return getClass().getName() + " -> brake()";
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }
}
