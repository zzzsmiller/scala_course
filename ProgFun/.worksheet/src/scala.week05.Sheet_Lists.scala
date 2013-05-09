package scala.week05

object Sheet_Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(219); 

  def initList[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("init of Empty list")
    case List(x) => Nil
    case y :: ys => y :: initList(ys)
  };System.out.println("""initList: [T](xs: List[T])List[T]""");$skip(24); 

  val xs = "fj".toList;System.out.println("""xs  : List[Char] = """ + $show(xs ));$skip(25); 
  val xxs = initList(xs);System.out.println("""xxs  : List[Char] = """ + $show(xxs ));$skip(16); val res$0 = 
  initList(xxs);System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(163); 

  def removeAt[T](n: Int, xs: List[T]): List[T] = {
    if (n < 0 || xs.isEmpty) xs
    else if (n == 0) xs.tail
    else xs.head :: removeAt(n - 1, xs.tail)
  };System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(41); val res$1 = 

  removeAt(1, List('a', 'b', 'c', 'd'));System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(214); 

  def flatten(xs: List[Any]): List[Any] =
    xs match {
      case Nil => Nil
      case Nil :: xs => flatten(xs)
      case (z :: zs) :: xs => z :: flatten(zs :: xs)
      case x :: xs => x :: flatten(xs)
    };System.out.println("""flatten: (xs: List[Any])List[Any]""");$skip(53); val res$2 = 

  flatten(List(List(1, 1), 2, List(3, List(5, 8))));System.out.println("""res2: List[Any] = """ + $show(res$2))}
  //   res0: List[Any] = List(1, 1, 2, 3, 5, 8
}
