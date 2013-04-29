package week02

object TailRecursive {

  def main(args: Array[String]): Unit = {
    print(sum (x => x*x,3,5))
    
  }
  
  def sum(f: Int => Int, a: Int, b: Int): Int ={
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, f(a) + acc)
    }
    loop(a, 0)
  }
  
  

}