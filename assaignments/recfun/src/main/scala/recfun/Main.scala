package recfun
import common._
import scala.collection.immutable.Stack
import sun.security.util.Length


object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (r == 0) 1
    else if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def checkBal(chars: List[Char], lPar: Int): Int = {
      if (lPar < 0) -1
      else if (chars.isEmpty) lPar
      else if (chars.head.equals('(')) checkBal(chars.tail, lPar + 1)
      else if (chars.head.equals(')')) checkBal(chars.tail, lPar - 1)
      else checkBal(chars.tail, lPar)
    }
    checkBal(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)    
  }   	
	
  
  
}
