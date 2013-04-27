package week01

object Sheet_factorial {
  def factorial(n:Int, k:Int):Int = {
  	if (n == 1) k
  	else factorial(n-1, (n-1)*k)
  }                                               //> factorial: (n: Int, k: Int)Int
  
  factorial(5, 5)                                 //> res0: Int = 120
}