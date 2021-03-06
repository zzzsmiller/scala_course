package week02

import week02.Rational

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

object Sheet_Rational {
  val x = new Rational(1,3)                       //> x  : week02.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : week02.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week02.Rational = 3/2
  
  x.sub(y).sub(z)                                 //> res0: week02.Rational = -79/42
}

