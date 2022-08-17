package oop.classes;

//Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
//The class needs to have two constructors.
// The first constructor does not have any parameters (no-arg constructor).
// The second constructor has parameters width and height of type double and it needs to initialize the fields.
// In case the width is less than 0 it needs to set the width field value to 0,
// in case the height parameter is less than 0 it needs to set the height field value to 0.
//Write the following methods (instance methods):
//
//Method named getWidth without any parameters, it needs to return the value of width field.
//Method named getHeight without any parameters, it needs to return the value of height field.
//Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
//Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
//Method named getArea without any parameters, it needs to return the area of the wall.
public class WallArea {

  private Double width;
  private Double height;


  public WallArea(Double width, Double height) {
    this.width = width;
    this.height = height;
  }

  public WallArea() {
  }

  public Double getWidth() {
    return width;
  }

  public Double getHeight() {
    return height;
  }

  public void setWidth(Double width) {
    if (width < 0) {
      this.width = (double) 0;
    } else {
      this.width = width;
    }
  }

  public void setHeight(Double height) {
    if (height < 0) {
      this.height = (double) 0;
    } else {
      this.height = height;
    }
  }

  public Double getArea() {
    return width * height;
  }
}
