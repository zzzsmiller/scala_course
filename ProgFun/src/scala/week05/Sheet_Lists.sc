package scala.week05

object Sheet_Lists {

  def initList[T](xs: List[T]): List[T] = xs match {
		case List() => throw new Error("init of Empty list")
		case List(x) => Nil
		case y :: ys => y :: initList(ys)
  }

	val xs = "fj".toList
	val xxs = initList(xs)
	initList(xxs)
	             
 def removeAt[T](n: Int, xs: List[T]): List[T] = {
 	if (n < 0 ||  xs.isEmpty) xs
 	else if (n == 0) xs.tail
 	else xs.head :: removeAt(n-1, xs.tail)
 }
 
 removeAt(1, List('a', 'b', 'c', 'd'))
 
 def flatten(list: List[Any]): List[Any] = {
 	def flattenHp(x: Any): List[Any] = x match {
 		//case List[Any] => flattenHp(x.head) ::: flattenHp(x.tail)
 		//case Any => List(x)
 	}
 	//case List(x) => flatten(x)
 	//case x :: xs => flatten(x) ::: flatten(xs)
 }
 
	flatten(List(List(1, 1), 2, List(3, List(5, 8))))
             //   res0: List[Any] = List(1, 1, 2, 3, 5, 8
}