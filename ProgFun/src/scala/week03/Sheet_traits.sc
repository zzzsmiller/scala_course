package week03

object Sheet_traits {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def nth[T](n: Int, list: List[T]): T = {
  	if (list.isEmpty) throw new IndexOutOfBoundsException
  	else if (n == 0) list.head
  	else nth(n-1, list.tail)
  }                                               //> nth: [T](n: Int, list: week03.List[T])T
  
  val l1 = new Cons(2, new Cons(4, new Cons(1, new Cons[Int](7, new Nil))))
                                                  //> l1  : week03.Cons[Int] = week03.Cons@73b9e5dc
  
  nth(3, l1)                                      //> res0: Int = 7
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