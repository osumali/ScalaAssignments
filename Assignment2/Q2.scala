package Assignment2

object Q2 {

  // 2. Imagine the owner of a movie theater who has complete freedom in setting ticket prices.
  // The more he charges, the fewer the people who can afford tickets. In a recent experiment
  // the owner determined a precise relationship between the price of a ticket and average
  // attendance.  At a price of Rs 15.00 per ticket, 120 people attend a performance.
  // Decreasing the price by  5 Rupees increases attendance by 20 and increasing the price by
  // 5 Rupees decreases attendance by 20. Unfortunately, the increased attendance also
  // comes at an increased cost. Every performance costs the owner Rs.500. Each attendee
  // costs another 3 Rupees. The owner would like to know the exact relationship between
  // profit and ticket price so that he can determine the price at which he can make the
  // highest profit. Implement a functional program to find out the best ticket price.

  def bestTicketPrice(): Double = {

    //let n be the factor by which the price changes. Thus the profit will be given by the equation,
    // revenue - cost i.e. [(15+5n)(120-20n)] - [500 + 3(120 - 20n)]
    // this equation can be simplified to -100n**2 + 360n + 940
    // once this is differentiated, we can obtain the first derivative i.e. -200n + 360
    // but the function(the profit function) is at it's maximum when the derivative is zero
    // that is when n = 360/200 = 1.8


    var n: Double = 1.0

    var prof: Double = (15+5*n)*(120 - 20*n) - (500 + 3*(120 - 20*n))
    var i: Double = 1
    var inter: Double = (15+5*n)*(120 - 20*n) - (500 + 3*(120 - 20*n))

    while(n<2.0){
      n=n+0.1

      inter =( (15+5*n)*(120 - 20*n)) - (500 + 3*(120 - 20*n))

      if (inter>prof){
        prof = inter
        i=n
      }

    }
    
    15 + 5 * i
  }

  def main(args: Array[String]){

    println("Rs. " + bestTicketPrice())

  }

}
