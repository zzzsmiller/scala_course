package common

object SheetCommon {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
  val per = 100;System.out.println("""per  : Int = """ + $show(per ));$skip(16); 
  val weeks = 7;System.out.println("""weeks  : Int = """ + $show(weeks ));$skip(42); 
  val arr = Array(6, 9.67, 9, 8, 8, 8, 8);System.out.println("""arr  : Array[Double] = """ + $show(arr ));$skip(194); 
  
  def total(weekTotal: Array[Double]): Double = {
			def sum(index: Int): Double = {
				if (index + 1 > weeks) 0
				else weekTotal(index) * 100 / 7 / 10 + sum(index + 1)
			}
			sum(0)
  };System.out.println("""total: (weekTotal: Array[Double])Double""");$skip(16); val res$0 = 
  
  total(arr);System.out.println("""res0: Double = """ + $show(res$0))}
}
