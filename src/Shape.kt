       /***** superclass called "Shape" that has two properties called shapeName and shapeColor
           and also has two functions one called "info" and "computeArea"*****/

open class Shape(val shapeName: String, val shapeColor: String) {
    /*------------------------------------------------------------------------------*/
        /***** functions called "info" that return name and color of shape.*****/
    fun info() {
        println("the shape name is:$shapeName and the color is:$shapeColor")
    }
    /*------------------------------------------------------------------------------*/
        /***** functions called "computeArea" that has no parameter, and return Double data type.*****/
    open fun computeArea(): Double {
        return 0.0
    }
}
    /*------------------------------------------------------------------------------*/
        /***** subclass class called "Triangle" that return the area of Triangle.*****/
class Triangle(var base: Double, var height: Double, shapeName: String, shapeColor: String) :
    Shape(shapeName, shapeColor) {
    override fun computeArea(): Double = (height * base) / 2
}
    /*------------------------------------------------------------------------------*/
        /***** subclass class called "Rectangle" that return the area of Rectangle.*****/
class Rectangle(var width: Double, var height: Double, shapeName: String, shapeColor: String) :
    Shape(shapeName, shapeColor) {
    override fun computeArea(): Double = height * width
}
    /*------------------------------------------------------------------------------*/
        /***** subclass class called "Circle" that return the area of Circle.*****/
class Circle(var radius: Double, shapeName: String, shapeColor: String) : Shape(shapeName, shapeColor) {
    val pi: Double = 3.14
    override fun computeArea(): Double = pi * (radius * radius)
}
    /*------------------------------------------------------------------------------*/
fun main() {
        /***** testing superclass "Shape" to see if it can return the name and the color of the shape.*****/
    val S = Shape("Shape", "grey")
    /*------------------------------------------------------------------------------*/
        /***** testing subclass "Triangle" to see if it can return name , color & area of "Triangle".*****/
    val T = Triangle(5.2, 3.1, "Triangle", "orange")
    T.info()
    println(T.computeArea())
    /*------------------------------------------------------------------------------*/
        /***** testing subclass "Rectangle" to see if it can return name , color & area of "Rectangle".*****/
    val R = Rectangle(7.2, 5.3, "Rectangle", "Blue")
    R.info()
    println(R.computeArea())
    /*------------------------------------------------------------------------------*/
        /***** testing subclass "Circle" to see if it can return name , color & area of "Circle".*****/
    val C = Circle(30.2, "Circle", "Green")
    C.info()
    println(C.computeArea())
}
