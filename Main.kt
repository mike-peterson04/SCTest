import jdk.jfr.Percentage

fun main() {
    testingGround()
}

// Creating Shape base class
abstract class Shape( ){
    abstract var area:Float
    abstract var name:String
     abstract fun increaseSize(percentage: Float)
}

//square class inheriting shape
class Square(): Shape() {


//default initialization
    var side:Float = 1f
    override var area: Float = 0.0f
    override var name: String = "Square"
    init {
        side = 1f
        area = side*side

    }
//inherited increaseSize method
    override fun increaseSize(percentage: Float) {
        area *= (1f+percentage)
    }


}

fun testingGround(){
    var i = 10
    var shapes = mutableListOf<Shape>()
    while (i>0){
        i--
        shapes.add(Square())
        println("the loop has $i processes remaining")
        for(shape in shapes){
            println("${shape.name} is ${shape.area}^2")
            shape.increaseSize(.1f)
        }
    }
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