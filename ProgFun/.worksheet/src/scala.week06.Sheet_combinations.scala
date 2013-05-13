package scala.week06

import scala.common._

object Sheet_combinations {
  type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(149); 

	val occS = List(('a', 2), ('b', 2));System.out.println("""occS  : List[(Char, Int)] = """ + $show(occS ));$skip(60); 
  val occ: Occurrences = List(('a', 2), ('b', 1), ('c', 2));System.out.println("""occ  : scala.week06.Sheet_combinations.Occurrences = """ + $show(occ ));$skip(709); 


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
  };System.out.println("""combinations: (occ: scala.week06.Sheet_combinations.Occurrences)List[scala.week06.Sheet_combinations.Occurrences]""");$skip(34); val res$0 = 
  
  printList(combinations(occ));System.out.println("""res0: Int = """ + $show(res$0));$skip(20); val res$1 = 
	combinations(occS);System.out.println("""res1: List[scala.week06.Sheet_combinations.Occurrences] = """ + $show(res$1))}
}
