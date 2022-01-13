import kotlin.math.sqrt

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
        area *= (1f+percentage)
        side = sqrt(area)
    }


}

class Circle(): Shape() {


    //default initialization
    var radius:Float = 1f
    val pi = 3.141f
    override var area: Float = 0.0f
    override var name: String = "Circle"
    init {
        area = (radius*radius)*pi

    }
    constructor(radius:Float) : this() {
        this.radius = radius
        this.area = (radius*radius)*pi

    }

    //inherited increaseSize method
    override fun increaseSize(percentage: Float) {
        area *= (1f+percentage)
        radius = sqrt((area/pi))
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
