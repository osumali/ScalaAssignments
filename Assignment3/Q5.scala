package Assignment3

object Q5 {

  def EvenSum(n: Int, s:Int =0 ): Int ={
    if(n==0){
      return s
    }
    if(n%2==0){
      EvenSum(n-1,s+n)
    }
    else{
      EvenSum(n-1,s)
    }

  }

  def main(args: Array[String]): Unit =  {
    println(EvenSum(9))
  }

}
