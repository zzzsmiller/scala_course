package scala.week06

object Sheet_for_in_high_order_functions {
	case class Book(title: String, authors: List[String])
	val books: List[Book] = List(
		Book(title = "Mdkd", authors = List("dkls", "dkdkd")),
		Book(title = "Mdkddsfsdf", authors = List("dklfsdfsdsdf", "d3klfdjkfsfdsdfkdkd")),
		Book(title = "Mdkdffdd", authors = List("dkls", "dklsldkkdkdkdkd")),
		Book(title = "Mdkfdfddffdd", authors = List("dkls", "d3klsdfsdldkkdkdkdkd"))
		
	)                                         //> books  : List[scala.week06.Sheet_for_in_high_order_functions.Book] = List(Bo
                                                  //| ok(Mdkd,List(dkls, dkdkd)), Book(Mdkddsfsdf,List(dklfsdfsdsdf, d3klfdjkfsfds
                                                  //| dfkdkd)), Book(Mdkdffdd,List(dkls, dklsldkkdkdkdkd)), Book(Mdkfdfddffdd,List
                                                  //| (dkls, d3klsdfsdldkkdkdkdkd)))
	val title = "dkls"                        //> title  : String = dkls

	 for (b <- books; a <- b.authors if a startsWith title)
  yield b.title                                   //> res0: List[String] = List(Mdkd, Mdkdffdd, Mdkdffdd, Mdkfdfddffdd)
  
  // 1st step
  books flatMap(
  	book => for (
  		a <- book.authors
  		if a startsWith title
  	) yield book.title)                       //> res1: List[String] = List(Mdkd, Mdkdffdd, Mdkdffdd, Mdkfdfddffdd)
  
  // 2nd step
  books flatMap(
  	book => book.authors
  		withFilter(a => a startsWith title)
  		map (t => book.title)
  	
  )                                               //> res2: List[String] = List(Mdkd, Mdkdffdd, Mdkdffdd, Mdkfdfddffdd)
}