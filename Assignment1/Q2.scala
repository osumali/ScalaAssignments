package Assignment1

object Q2 {

  //2.The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

  def volCalc(r: Float) = {
    print((4.0/3)*(scala.math.Pi)*(scala.math.pow(r,3)))
  }

  def main(args: Array[String]): Unit = {
    volCalc(5)
  }

}
