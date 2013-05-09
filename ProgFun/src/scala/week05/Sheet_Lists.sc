package scala.week05

object Sheet_Lists {

  def initList[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("init of Empty list")
    case List(x) => Nil
    case y :: ys => y :: initList(ys)
  }                                               //> initList: [T](xs: List[T])List[T]

  val xs = "fj".toList                            //> xs  : List[Char] = List(f, j)
  val xxs = initList(xs)                          //> xxs  : List[Char] = List(f)
  initList(xxs)                                   //> res0: List[Char] = List()

  def removeAt[T](n: Int, xs: List[T]): List[T] = {
    if (n < 0 || xs.isEmpty) xs
    else if (n == 0) xs.tail
    else xs.head :: removeAt(n - 1, xs.tail)
  }                                               //> removeAt: [T](n: Int, xs: List[T])List[T]

  removeAt(1, List('a', 'b', 'c', 'd'))           //> res1: List[Char] = List(a, c, d)

  def flatten(xs: List[Any]): List[Any] =
    xs match {
      case Nil => Nil
      case Nil :: xs => flatten(xs)
      case (z :: zs) :: xs => z :: flatten(zs :: xs)
      case x :: xs => x :: flatten(xs)
    }                                             //> flatten: (xs: List[Any])List[Any]

  flatten(List(List(1, 1), 2, List(3, List(5, 8))))
                                                  //> res2: List[Any] = List(1, 1, 2, 3, List(5, 8))
  //   res0: List[Any] = List(1, 1, 2, 3, 5, 8
}