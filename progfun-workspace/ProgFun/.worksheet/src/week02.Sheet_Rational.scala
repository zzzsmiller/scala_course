package week02

object Sheet_Rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
  val x = new Rational(1,3);System.out.println("""x  : week02.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : week02.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : week02.Rational = """ + $show(z ));$skip(21); val res$0 = 
  
  x.sub(y).sub(z);System.out.println("""res0: week02.Rational = """ + $show(res$0))}
}

class Rational(x: Int, y: Int) {
	val numer = x
	val denom = y
	
	override def toString = numer + "/" + denom
	
	def add(that: Rational) = new Rational(
		numer * that.denom + that.numer * denom,
		denom * that.denom)
	
	def neg = new Rational(-numer, denom)
	
	def sub(that: Rational) = add(that.neg)
}
