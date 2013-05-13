package scala.week06

import scala.common._

object Sheet_combinations {
  type Occurrences = List[(Char, Int)]

	val occS = List(('a', 2), ('b', 2))       //> occS  : List[(Char, Int)] = List((a,2), (b,2))
  val occ: Occurrences = List(('a', 2), ('b', 1), ('c', 2))
                                                  //> occ  : scala.week06.Sheet_combinations.Occurrences = List((a,2), (b,1), (c,2
                                                  //| ))


  def combinations(occ: Occurrences): List[Occurrences] = {
    def elemComb(x: (Char, Int)): List[Occurrences] =
    	(for (i <- 1 to x._2) yield (x._1, i) :: Nil).toList
    
    def mixComb(occ: List[Occurrences], occ1: List[Occurrences]): List[Occurrences] = {
    	occ flatMap (x =>
    		occ1 map (y => y ++ x )
		)
    
    	//stub
    	//List(List(Nil))
    }
    
    def comb(occ: Occurrences): List[Occurrences] = occ match {
    	case Nil => List(List())
    	case x :: xs => {
    		val elc = elemComb(x)
    		val rest = comb(xs)
    		rest ++ mixComb(elc, rest)
			}
    }
 		   
 		comb(occ.reverse)
      //(x._1, i) :: (y._1, j) :: Nil
    
	//printList(tt)
    //stub
    //List(Nil)
  }                                               //> combinations: (occ: scala.week06.Sheet_combinations.Occurrences)List[scala.w
                                                  //| eek06.Sheet_combinations.Occurrences]
  
  printList(combinations(occ))                    //> List()
                                                  //| List((a,1))
                                                  //| List((a,2))
                                                  //| List((b,1))
                                                  //| List((a,1), (b,1))
                                                  //| List((a,2), (b,1))
                                                  //| List((c,1))
                                                  //| List((a,1), (c,1))
                                                  //| List((a,2), (c,1))
                                                  //| List((b,1), (c,1))
                                                  //| List((a,1), (b,1), (c,1))
                                                  //| List((a,2), (b,1), (c,1))
                                                  //| List((c,2))
                                                  //| List((a,1), (c,2))
                                                  //| List((a,2), (c,2))
                                                  //| List((b,1), (c,2))
                                                  //| List((a,1), (b,1), (c,2))
                                                  //| List((a,2), (b,1), (c,2))
                                                  //| res0: Int = 0
	combinations(occS)                        //> res1: List[scala.week06.Sheet_combinations.Occurrences] = List(List(), List(
                                                  //| (a,1)), List((a,2)), List((b,1)), List((a,1), (b,1)), List((a,2), (b,1)), Li
                                                  //| st((b,2)), List((a,1), (b,2)), List((a,2), (b,2)))
}