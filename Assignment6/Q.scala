package Assignment6

object Q {

  case class Point(a: Int, b: Int) {
    def x: Int = a
    def y: Int = b

    def +(that: Point) =
     new Point(this.x + that.x, this.y + that.y)

    def invert =
      new Point(this.y , this.x)

    def distance(that: Point) =
      scala.math.pow((scala.math.pow((this.x - that.x), 2) + scala.math.pow((this.y - that.y), 2)), 0.5)


    def move(dx: Int, dy: Int) ={
      new Point(this.x + dx, this.y + dy)
    }
  }

  def main(args: Array[String]): Unit = {
    var a = new Point(4,5)
    var b = new Point(2,3)
    println("a = "+a)
    println("b = "+b)
    var c = a + b
    println("a + b = "+c)

    println("a moved by (10,10) = "+a.move(10,3))

    println("distance between a and b = "+a.distance(b))

    println("inverted a = "+a.invert)
  }
}
