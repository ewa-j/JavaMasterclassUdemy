package oop.encaplulationAndpolymorphism;

public class Mitsubishi extends Car{

  public Mitsubishi(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public String startEngine() {
    return getClass().getName() + " -> startEngine()";
  }

  @Override
  public String accelerate() {
    return getClass().getName() + " -> accelerate()";
  }

  @Override
  public String brake() {
    return getClass().getName() + " -> brake()";
  }
}
