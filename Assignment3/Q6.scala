package Assignment3

object Q6 {

  def Fibonacci(n: Int, i:Int =1, a: Int= 0, b: Int=1): Unit ={
    if(n==i){
      print(a)
    }

    else{
      print(a + ", ")
      Fibonacci(n,i+1,b,a+b)
    }

  }

  def main(args: Array[String]): Unit =  {
    Fibonacci(10)
  }
}
