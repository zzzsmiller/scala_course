package scala.week05

object Sheet_Map_and_Length_List_Func {
  val l = List(1, 5, 7, 2, -7)                    //> l  : List[Int] = List(1, 5, 7, 2, -7)

  def mapFunc[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())((x, y) => (f(x) :: y))
                                                  //> mapFunc: [T, U](xs: List[T], f: T => U)List[U]
  def mapper[T](x: T) = "num at " + (l.indexOf(x, 0) + 1) + " is " + x.toString
                                                  //> mapper: [T](x: T)String

  l map mapper                                    //> res0: List[String] = List(num at 1 is 1, num at 2 is 5, num at 3 is 7, num a
                                                  //| t 4 is 2, num at 5 is -7)

  mapFunc(l, mapper)                              //> res1: List[String] = List(num at 1 is 1, num at 2 is 5, num at 3 is 7, num a
                                                  //| t 4 is 2, num at 5 is -7)

  def lengthFunc[T](xs: List[T]): Int =
    (xs foldRight 0)((x, y) => y + 1)             //> lengthFunc: [T](xs: List[T])Int
	
	lengthFunc(l)                             //> res2: Int = 5
	l.length                                  //> res3: Int = 5
}