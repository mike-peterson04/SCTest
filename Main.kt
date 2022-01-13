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
        area = side*side

    }
    constructor(side:Float) : this() {
        this.side = side
        this.area = side*side

    }

//inherited increaseSize method
    override fun increaseSize(percentage: Float) {
    // it would be more accurate to increase this.side by percentage and then recalculate area but as I wasn't planning on doing that for circle I opted not to do it here for consistency
        area *= (1f+percentage)
    }


}

class Circle(): Shape() {


    //default initialization
    var radius:Float = 1f
    override var area: Float = 0.0f
    override var name: String = "Circle"
    init {
        area = (radius*radius)*3.14159f

    }
    constructor(radius:Float) : this() {
        this.radius = radius
        this.area = (radius*radius)*3.14159f

    }

    //inherited increaseSize method
    override fun increaseSize(percentage: Float) {
        //as we are only ever dealing with the area of the circle I am only increasing the area I could back-solve by taking the modified area dividing by pi and reassigning the sqrt of that value to radius but for the purposes described I thought this was the most elegant solution
        area *= (1f+percentage)
    }


}


fun testingGround(){
    var shapes = mutableListOf<Shape>()
    shapes.add(Square(3f))
    shapes.add(Circle(2f))

    //originally was going to format the area to 2 decimals but as it is specifically requested to keep the code as simple as possible I decided against it
    for (shape in shapes){
        println("Prior to edit ${shape.name} has an area of ${shape.area}")
        shape.increaseSize(.1f)
        println("after size increase ${shape.name} has an area of ${shape.area}")
    }
}
