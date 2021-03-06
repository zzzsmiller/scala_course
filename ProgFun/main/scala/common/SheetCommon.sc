package common

object SheetCommon {
  val per = 100                                   //> per  : Int = 100
  val weeks = 7                                   //> weeks  : Int = 7
  val arr = Array(6, 9.67, 9, 8, 8, 8, 8)         //> arr  : Array[Double] = Array(6.0, 9.67, 9.0, 8.0, 8.0, 8.0, 8.0)
  
  def total(weekTotal: Array[Double]): Double = {
			def sum(index: Int): Double = {
				if (index + 1 > weeks) 0
				else weekTotal(index) * 100 / 7 / 10 + sum(index + 1)
			}
			sum(0)
  }                                               //> total: (weekTotal: Array[Double])Double
  
  total(arr)                                      //> res0: Double = 80.95714285714286
}