package Assignment5

object Q1 {
  class Rational(nm: Int, den: Int) {

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)

    private val g = gcd(nm, den)
    def numer = nm / g
    def denom = den / g

    def neg = new Rational(-this.numer, this.denom)

  }

  def main(args: Array[String]): Unit ={

    val x = new Rational(3, 4)

    print(x.neg.numer+"/"+x.neg.denom)


  }


}
