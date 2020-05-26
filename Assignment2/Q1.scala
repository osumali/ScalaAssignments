package Assignment2

object Q1 {

  //1. Company XYZ & Co. pays all its employees Rs.150 per normal working hour and Rs. 75 per
  // OT hour. A typical employee works 40 (normal) and 20(OT) hours per week has to pay 10% tax.
  // Develop a functional program that determines the take home salary of an employee from
  // the number of working hours and OT hours given.

  def main(args: Array[String]){

    def takeHomeSalary(normal: Int, ot: Int): Double = ((150*normal)+(75*ot))*90/100

    println(takeHomeSalary(40, 20))

  }

}
