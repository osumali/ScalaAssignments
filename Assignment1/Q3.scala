package Assignment1

object Q3 {

  //3. Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount.
  //Shipping costs Rs. 3 for the first 50 copy and 75 cents for each additional copy.
  //What is the total wholesale cost for 60 copies?

  def WScost(c: Int) : Double = {
    var price :Double = 24.95*0.6*c;

    if(c>50){
      return (price + 50*3 + (c-50)*0.75)
    }
    else{
      return (price + c*3)
    }
  }

  def main(args: Array[String]) {
    println("Rs." + WScost(60))
  }

}
