package scala.week06

object Sheet_Map_Varies {

  type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(163); 

  val x = List(('a', 1), ('d', 1), ('r', 2), ('l', 1), ('r', 1), ('r', 3));System.out.println("""x  : List[(Char, Int)] = """ + $show(x ));$skip(25); 
  val y = List(('r', 1));System.out.println("""y  : List[(Char, Int)] = """ + $show(y ));$skip(25); 

  val z = List(1, 2, 0);System.out.println("""z  : List[Int] = """ + $show(z ));$skip(112); 

  def mapper(x: List[(Char, Int)]) =
    x groupBy (el => el._1) map (y => (y._1, (y._2 map (z => z._2)).max));System.out.println("""mapper: (x: List[(Char, Int)])scala.collection.immutable.Map[Char,Int]""");$skip(23); 
  val mapx = mapper(x);System.out.println("""mapx  : scala.collection.immutable.Map[Char,Int] = """ + $show(mapx ));$skip(23); 
  val mapy = mapper(y);System.out.println("""mapy  : scala.collection.immutable.Map[Char,Int] = """ + $show(mapy ));$skip(113); 

	def occMapper(occ: Occurrences, m: (Char, Int)): Occurrences =
		(m._1, m._2 - mapy.getOrElse(m._1, 0)) :: occ;System.out.println("""occMapper: (occ: scala.week06.Sheet_Map_Varies.Occurrences, m: (Char, Int))scala.week06.Sheet_Map_Varies.Occurrences""");$skip(115); 
   def uncombine(occ: Occurrences): Occurrences =
   	for {
   		t <- occ
   		i <-1 to t._2
   	} yield (t._1, i);System.out.println("""uncombine: (occ: scala.week06.Sheet_Map_Varies.Occurrences)scala.week06.Sheet_Map_Varies.Occurrences""");$skip(136); val res$0 = 
   	
   	
   	//occ map (t => (1 to t._2) flatMap (i => (t._1, i)) )
   	
  
  uncombine(mapx.foldLeft[Occurrences](List())(occMapper));System.out.println("""res0: scala.week06.Sheet_Map_Varies.Occurrences = """ + $show(res$0))}

  //mapx.updated(key, value)
  //mapx.applyOrElse(x, default)
}
