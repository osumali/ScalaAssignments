package Assignment5

object Q4 {

  class Account(id: String, acNo: Int, cash: Double){
    val nic:String = id
    val acnumber: Int = acNo
    var balance: Double = cash

    def withdraw(a:Float) =
      this.balance = this.balance - a

    def transfer(toAcc: Account): Unit ={
      toAcc.balance = toAcc.balance + this.balance
      this.balance = 0
    }


  }

  def negBalanceAccs(banks: List[Account]): Unit ={
    for (bank<-banks){
      if(bank.balance<0){
        print(bank.acnumber+"\n")
      }
    }
  }

  def TotAccBalance(banks: List[Account]): Unit ={
    var sum:Double = 0

    banks.foreach(sum+=_.balance)
    print(sum)
  }

  def CalAllInterests(banks: List[Account]): Unit ={

    banks.foreach(i => if(i.balance>0) print(i.acnumber+" "+i.balance*1.05+"\n")
                       else print(i.acnumber+" "+i.balance*1.1+"\n") )

  }

  def main(args: Array[String]): Unit ={

    val accA = new Account("232v", 1, 20000)
    val accB = new Account("567v", 2, 30000)
    val accC = new Account("567v", 3, -2000)
    val accD = new Account("498v", 4, -6700)

    var banks:List[Account]=List(accA, accB, accC, accD)

    print("\nBank accounts with negative balances: \n")
    negBalanceAccs(banks)
    print("\n")
    print("Total balance of all accounts: ")
    TotAccBalance(banks)
    print("\n")
    print("\n")
    print("Final balances of all accounts:\n")
    CalAllInterests(banks)


  }

}
