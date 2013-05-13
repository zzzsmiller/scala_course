package scala

package object common {
  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }
  
  def printList(list: List[Any]): Int = list match {
    case Nil => { 0}
    case x :: xs => { println(x); printList(xs); 0}
  }
}