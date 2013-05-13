package scala.week06

object Sheet_Map_Varies {

  type Occurrences = List[(Char, Int)]

  val x = List(('a', 1), ('d', 1), ('r', 2), ('l', 1), ('r', 1), ('r', 3))
  val y = List(('r', 1))

  val z = List(1, 2, 0)
,

  def mapper(x: List[(Char, Int)]) =
    x groupBy (el => el._1) map (y => (y._1, (y._2 map (z => z._2)).max))
  val mapx = mapper(x)
  val mapy = mapper(y)

	def occMapper(occ: Occurrences, m: (Char, Int)): Occurrences =
		(m._1, m._2 - mapy.getOrElse(m._1, 0)) :: occ
   def uncombine(occ: Occurrences): Occurrences =
   	for {
   		t <- occ
   		i <-1 to t._2
   	} yield (t._1, i)
   	
   	
   	//occ map (t => (1 to t._2) flatMap (i => (t._1, i)) )
   	
  
  uncombine(mapx.foldLeft[Occurrences](List())(occMapper))

  //mapx.updated(key, value)
  //mapx.applyOrElse(x, default)
}