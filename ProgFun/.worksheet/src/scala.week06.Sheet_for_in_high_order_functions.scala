package scala.week06

object Sheet_for_in_high_order_functions {
	case class Book(title: String, authors: List[String]);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(448); 
	val books: List[Book] = List(
		Book(title = "Mdkd", authors = List("dkls", "dkdkd")),
		Book(title = "Mdkddsfsdf", authors = List("dklfsdfsdsdf", "d3klfdjkfsfdsdfkdkd")),
		Book(title = "Mdkdffdd", authors = List("dkls", "dklsldkkdkdkdkd")),
		Book(title = "Mdkfdfddffdd", authors = List("dkls", "d3klsdfsdldkkdkdkdkd"))
		
	);System.out.println("""books  : List[scala.week06.Sheet_for_in_high_order_functions.Book] = """ + $show(books ));$skip(20); 
	val title = "dkls";System.out.println("""title  : String = """ + $show(title ));$skip(74); val res$0 = 

	 for (b <- books; a <- b.authors if a startsWith title)
  yield b.title;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(122); val res$1 = 
  
  // 1st step
  books flatMap(
  	book => for (
  		a <- book.authors
  		if a startsWith title
  	) yield book.title);System.out.println("""res1: List[String] = """ + $show(res$1));$skip(132); val res$2 = 
  
  // 2nd step
  books flatMap(
  	book => book.authors
  		withFilter(a => a startsWith title)
  		map (t => book.title)
  	
  );System.out.println("""res2: List[String] = """ + $show(res$2))}
}
