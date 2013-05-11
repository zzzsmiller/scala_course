package scala.week06

object Sheet_Collections_isPrime {
	def isPrime(x: Int): Boolean = x > 1 && !((2 until x) exists (y => x%y == 0))
                                                  //> isPrime: (x: Int)Boolean
	//given solution
	def isPrime2(n: Int): Boolean = (2 until n) forall (d => n%d !=0)
                                                  //> isPrime2: (n: Int)Boolean
	
	val l = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31)
                                                  //> l  : List[Int] = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31)
	
	val l2 = List(6)                          //> l2  : List[Int] = List(6)
	
	val l3 = List(29, 31, -3)                 //> l3  : List[Int] = List(29, 31, -3)
	
	l forall isPrime                          //> res0: Boolean = true
	
	l2 forall isPrime                         //> res1: Boolean = false
  
  l3 forall isPrime                               //> res2: Boolean = false
  
  isPrime(6)                                      //> res3: Boolean = false
  (2 until 6) exists (y => 6%y == 0)              //> res4: Boolean = true
   6 % 3                                          //> res5: Int(0) = 0
  
  l forall isPrime2                               //> res6: Boolean = true
  
  l2 forall isPrime2                              //> res7: Boolean = false
  
  l3 forall isPrime2                              //> res8: Boolean = true
                                                  
}