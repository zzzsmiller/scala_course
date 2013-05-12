package scala.week06

object Sheet_scalar_product {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 

  val l1: List[Double] = List(3, 3, 4, 1, 2);System.out.println("""l1  : List[Double] = """ + $show(l1 ));$skip(46); 
  val l2: List[Double] = List(1, 2, 5, 11, 5);System.out.println("""l2  : List[Double] = """ + $show(l2 ));$skip(195); 

	// wrong
  def scalarProduct2(xs: List[Double], ys: List[Double]): List[Double] = {
    (for {
      x <- xs
      y <- ys
      if (ys indexOf y) == (xs indexOf x)
    } yield x * y
    )
  };System.out.println("""scalarProduct2: (xs: List[Double], ys: List[Double])List[Double]""");$skip(134); 

  //Given solution
  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (for ((x, y) <- xs zip ys) yield x * y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(25); val res$0 = 

  scalarProduct(l1, l2);System.out.println("""res0: Double = """ + $show(res$0));$skip(13); val res$1 = 

  l1 zip l2;System.out.println("""res1: List[(Double, Double)] = """ + $show(res$1));$skip(26); val res$2 = 

  scalarProduct2(l1, l2);System.out.println("""res2: List[Double] = """ + $show(res$2))}
}
