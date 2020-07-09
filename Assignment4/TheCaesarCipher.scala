package Assignment4

import java.util.Scanner

object TheCaesarCipher {

  def Encrypt(msg: String, shift: Int) = {

    for( a <- 0 to msg.length()-1){

      if(!msg(a).isLetter){
        print(' ')
      }

      if(msg(a).isUpper){
        if(msg(a)+shift<=90){
          print((msg(a)+shift).toChar)
        }
        else{
          print((msg(a)+shift-26).toChar)
        }
      }
      if(msg(a).isLower){
        if(msg(a)+shift<=122){
          print((msg(a)+shift).toChar)
        }
        else{
          print((msg(a)+shift-26).toChar)
        }
      }

    }
    print("\n")

  }

  def Decrypt(msg: String, shift: Int) = {
    for( a <- 0 to msg.length()-1){

      if(!msg(a).isLetter){
        print(' ')
      }

      if(msg(a).isUpper){
        if(msg(a)-shift>=65){
          print((msg(a)-shift).toChar)
        }
        else{
          print((msg(a)-shift+26).toChar)
        }
      }
      if(msg(a).isLower){
        if(msg(a)-shift>=97){
          print((msg(a)-shift).toChar)
        }
        else{
          print((msg(a)-shift+26).toChar)
        }
      }

    }
    print("\n")

  }

  def main(args: Array[String]){

    val texts = new Scanner(System.in)

    print("You want to Encrypt, or Decrypt?(Enter E or D)")
    val opt = texts.nextLine()

    if(opt=="E"){
      println("Enter the plaintext to be encrypted: ")
      val plaintext = texts.nextLine()

      print("Enter the shift: ")
      val shift = scala.io.StdIn.readInt()

      print("The message is: ")
      Encrypt(plaintext, shift)

    }

    else if(opt=="D"){
      println("Enter the cyphertext to be decrypted: ")
      val cyphertext = texts.nextLine()

      print("Enter the shift: ")
      val shift = scala.io.StdIn.readInt()

      print("The message is: ")
      Decrypt(cyphertext, shift)
    }

    else{
      print("OPTION INVALID\n")
    }




  }

}
