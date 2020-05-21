package Assignment1

object Q1 {

  //1. The temperature is 35C; convert this temperature into Fahrenheit.
  //ºF =ºC * 1.8000 + 32.00

  def tempConverter(c: Int) = {
    print((c * 1.8000 + 32.00)+" F")
  }

  def main(args: Array[String]): Unit = {
    tempConverter(35)
  }


}
