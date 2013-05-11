package scala.week05

object Sheet_Map_and_Length_List_Func {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  val l = List(1, 5, 7, 2, -7);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(108); 

  def mapFunc[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())((x, y) => (f(x) :: y));System.out.println("""mapFunc: [T, U](xs: List[T], f: T => U)List[U]""");$skip(80); 
  def mapper[T](x: T) = "num at " + (l.indexOf(x, 0) + 1) + " is " + x.toString;System.out.println("""mapper: [T](x: T)String""");$skip(16); val res$0 = 

  l map mapper;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(22); val res$1 = 

  mapFunc(l, mapper);System.out.println("""res1: List[String] = """ + $show(res$1));$skip(79); 

  def lengthFunc[T](xs: List[T]): Int =
    (xs foldRight 0)((x, y) => y + 1);System.out.println("""lengthFunc: [T](xs: List[T])Int""");$skip(17); val res$2 = 
	
	lengthFunc(l);System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
	l.length;System.out.println("""res3: Int = """ + $show(res$3))}
}
