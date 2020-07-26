package Assignment5

object Q3 {

  class Account(id: String, acNo: Int, cash: Double){
    val nic:String = id
    val acnumber: Int = acNo
    var balance: Double = cash

    def transfer(toAcc: Account): Unit ={
      toAcc.balance = toAcc.balance + this.balance
      this.balance = 0
    }


  }



  def main(args: Array[String]): Unit ={

    val accA = new Account("232v", 1, 20000)
    val accB = new Account("567v", 2, 30000)

    accA.transfer(accB)

    print("\nBalance of Account "+ accA.acnumber+" after transferring its cash to Account "+ accB.acnumber+" : ")
    print(accA.balance+"\n")
    print("Final balance of Account "+ accB.acnumber+ " : ")
    print(accB.balance)

  }

}
