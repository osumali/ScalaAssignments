package Assignment3

object Q4 {

  def OorE(n: Int, i:Int =0 ): Unit ={
    if(i%2==0){
      print(i+ " - Even\n")
    }
    else{
      print(i+ " - Odd\n")
    }

    if(i<n){
      OorE(n,i+1)
    }
  }

  def main(args: Array[String]): Unit =  {
    OorE(5)
  }
}
