package scala.week06

object Sheet_Collections_isPrime {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(135); 
	def isPrime(x: Int): Boolean = x > 1 && !((2 until x) exists (y => x%y == 0));System.out.println("""isPrime: (x: Int)Boolean""");$skip(85); 
	//given solution
	def isPrime2(n: Int): Boolean = (2 until n) forall (d => n%d !=0);System.out.println("""isPrime2: (n: Int)Boolean""");$skip(56); 
	
	val l = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(20); 
	
	val l2 = List(6);System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(29); 
	
	val l3 = List(29, 31, -3);System.out.println("""l3  : List[Int] = """ + $show(l3 ));$skip(20); val res$0 = 
	
	l forall isPrime;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(21); val res$1 = 
	
	l2 forall isPrime;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(23); val res$2 = 
  
  l3 forall isPrime;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(16); val res$3 = 
  
  isPrime(6);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(37); val res$4 = 
  (2 until 6) exists (y => 6%y == 0);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(9); val res$5 = 
   6 % 3;System.out.println("""res5: Int(0) = """ + $show(res$5));$skip(23); val res$6 = 
  
  l forall isPrime2;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(24); val res$7 = 
  
  l2 forall isPrime2;System.out.println("""res7: Boolean = """ + $show(res$7));$skip(24); val res$8 = 
  
  l3 forall isPrime2;System.out.println("""res8: Boolean = """ + $show(res$8))}
                                                  
}
