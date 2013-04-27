package week01

object Sheet_factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(131); 
  def factorial(n:Int, k:Int):Int = {
  	if (n == 1) k
  	else factorial(n-1, (n-1)*k)
  };System.out.println("""factorial: (n: Int, k: Int)Int""");$skip(21); val res$0 = 
  
  factorial(5, 5);System.out.println("""res0: Int = """ + $show(res$0))}
}
