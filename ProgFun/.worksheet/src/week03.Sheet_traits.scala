package week03

object Sheet_traits {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(162); 
  def nth[T](n: Int, list: List[T]): T = {
  	if (list.isEmpty) throw new IndexOutOfBoundsException
  	else if (n == 0) list.head
  	else nth(n-1, list.tail)
  };System.out.println("""nth: [T](n: Int, list: week03.List[T])T""");$skip(79); 
  
  val l1 = new Cons(2, new Cons(4, new Cons(1, new Cons[Int](7, new Nil))));System.out.println("""l1  : week03.Cons[Int] = """ + $show(l1 ));$skip(16); val res$0 = 
  
  nth(3, l1);System.out.println("""res0: Int = """ + $show(res$0))}
}

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}
class Nil[T] extends List[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}
