package Assignment5

object Q2 {
  class Rational(nm: Int, den: Int) {

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)

    private val g = gcd(nm, den)
    def numer = nm / g
    def denom = den / g

    def neg = new Rational(-this.numer, this.denom)

    def sub(r: Rational) =
      new Rational(numer * r.denom + r.neg.numer * denom,
        denom * r.denom)

  }

  def main(args: Array[String]): Unit ={

    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)


    print(x.sub(y).sub(z).numer+"/"+x.sub(y).sub(z).denom)
  }


}
