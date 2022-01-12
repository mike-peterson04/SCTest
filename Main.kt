fun main() {
    println("Hello World")
}

// Creating Shape base class
abstract class Shape(var area:Float, var name:String){
     abstract fun increaseSize()
}

/*
Please complete the following coding assignment.

Create a Square class derived from Shape with a default side length of 1
Create a Circle class derived from Shape with a default radius of 1
The area property should return the area of the shape
The name property should return the name of the shape (“Square” or “Circle”)
The increaseSize method should take a percentage parameter and increase the size of the shape by that percentage
Create a collection of Shapes
Insert a Square object into the Shapes collection with a side length of 3
Insert a Circle into the Shapes collection with a radius of 2
Use a loop to do the following for each shape:
Print the name and area of the shape
Increase the size of the shape by 10%
Print the name and new area of the shape.
*/