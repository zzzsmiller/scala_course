package scala.week05

object Sheet_Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(213); 

  def initList[T](xs: List[T]): List[T] = xs match {
		case List() => throw new Error("init of Empty list")
		case List(x) => Nil
		case y :: ys => y :: initList(ys)
  };System.out.println("""initList: [T](xs: List[T])List[T]""");$skip(23); 

	val xs = "fj".toList;System.out.println("""xs  : List[Char] = """ + $show(xs ));$skip(24); 
	val xxs = initList(xs);System.out.println("""xxs  : List[Char] = """ + $show(xxs ));$skip(15); val res$0 = 
	initList(xxs);System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(168); 
	             
 def removeAt[T](n: Int, xs: List[T]): List[T] = {
 	if (n < 0 ||  xs.isEmpty) xs
 	else if (n == 0) xs.tail
 	else xs.head :: removeAt(n-1, xs.tail)
 };System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(41); val res$1 = 
 
 removeAt(1, List('a', 'b', 'c', 'd'));System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(267); 
 
 def flatten(list: List[Any]): List[Any] = {
 	def flattenHp(x: Any): List[Any] = x match {
 		//case List[Any] => flattenHp(x.head) ::: flattenHp(x.tail)
 		//case Any => List(x)
 	}
 	//case List(x) => flatten(x)
 	//case x :: xs => flatten(x) ::: flatten(xs)
 };System.out.println("""flatten: (list: List[Any])List[Any]""");$skip(53); val res$2 = 
 
	flatten(List(List(1, 1), 2, List(3, List(5, 8))));System.out.println("""res2: List[Any] = """ + $show(res$2))}
             //   res0: List[Any] = List(1, 1, 2, 3, 5, 8
}
