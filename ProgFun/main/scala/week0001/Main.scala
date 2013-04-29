package week001


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
    
    def foreach(chars: List[Char], ch: Char):Int = {      
      val range = 0 to chars.length-1 by 1      
      for (i <- range) {        
          if (ch.equals(chars(i))) 
            return i          
      }
      return -1
    }

    def loop(chars: List[Char]): Int = {
      var prev_left = -1;
      val left = foreach(chars, '(');
      var right = foreach(chars, ')');
      if (left < right) {
        prev_left = left;
        if (left == chars.length) return -1;
        right = loop(chars.drop(0));
//        return loop(chars.drop(prev_left).dropRight(n))
      } else 
        return right;
      
      return -1;
    }
    
    return loop(chars) == -1;    
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
