package Assignment3

object Q1 {

  def prime(n: Int, i: Int = 2):Boolean = {

    if (n < 2) {
      return false
    }
    if (n == 2) {
      return true
    }

    if(n==i){
      return true
    }

    if (n % i == 0) {
      return false
    }



    prime(n, i + 1)
}

  def main(args: Array[String]): Unit = {
    print(prime(23))
  }


}
