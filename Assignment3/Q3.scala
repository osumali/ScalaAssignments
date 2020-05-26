package Assignment3

object Q3 {

  def sum(n : Int, s: Int=0): Int ={
    if(n==0){
      s
    }
    else{
      sum(n-1,s+n)
    }
  }



  def main(args: Array[String]): Unit = {
    println(sum(5))
  }

}
