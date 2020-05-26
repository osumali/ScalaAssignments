package Assignment3

object Q2 {

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
  def primeSeq(n: Int, j: Int = 2){

    if(n<2){
      return
    }
    if(n==j){
      return
    }

    if(prime(j)){
      print(j+", ")
    }
    primeSeq(n,j+1)

  }



  def main(args: Array[String]): Unit = {
    println(primeSeq(40)+"\b\b\b\b")

  }


}
