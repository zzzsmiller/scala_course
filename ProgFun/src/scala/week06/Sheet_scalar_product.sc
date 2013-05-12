package scala.week06

object Sheet_scalar_product {

  val l1: List[Double] = List(3, 3, 4, 1, 2)      //> l1  : List[Double] = List(3.0, 3.0, 4.0, 1.0, 2.0)
  val l2: List[Double] = List(1, 2, 5, 11, 5)     //> l2  : List[Double] = List(1.0, 2.0, 5.0, 11.0, 5.0)

	// wrong
  def scalarProduct2(xs: List[Double], ys: List[Double]): List[Double] = {
    (for {
      x <- xs
      y <- ys
      if (ys indexOf y) == (xs indexOf x)
    } yield x * y
    )
  }                                               //> scalarProduct2: (xs: List[Double], ys: List[Double])List[Double]

  //Given solution
  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (for ((x, y) <- xs zip ys) yield x * y).sum   //> scalarProduct: (xs: List[Double], ys: List[Double])Double

  scalarProduct(l1, l2)                           //> res0: Double = 50.0

  l1 zip l2                                       //> res1: List[(Double, Double)] = List((3.0,1.0), (3.0,2.0), (4.0,5.0), (1.0,11
                                                  //| .0), (2.0,5.0))

  scalarProduct2(l1, l2)                          //> res2: List[Double] = List(3.0, 3.0, 20.0, 20.0, 11.0)
}