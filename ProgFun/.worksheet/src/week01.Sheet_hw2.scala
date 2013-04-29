package week01

object Sheet_hw2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(376); 
  def foreach(chars: List[Char], start: Int, stop: Int, num: Int) = {
  	println("starts");
    val parathn = Array('(', ')');
    for (i <- (start to stop by -1)) {
    	println(chars(i))
    
      if (parathn.contains(chars(i))) {
        if (parathn(num).equals(chars(i)))
          i
        else
          -1
      }
    }
    stop
  };System.out.println("""foreach: (chars: List[Char], start: Int, stop: Int, num: Int)Int""");$skip(57); val res$0 = 

	foreach("Works".toList, "Works".toList.length-1, 0, 0);System.out.println("""res0: Int = """ + $show(res$0));$skip(83); 
                                                  
  val parathn = Array('(', ')');System.out.println("""parathn  : Array[Char] = """ + $show(parathn ));$skip(15); 

	val cj = ')';System.out.println("""cj  : Char = """ + $show(cj ));$skip(24); val res$1 = 
	
	parathn.contains(cj);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(31); val res$2 = 
	
	"Works".toList.dropRight(1);System.out.println("""res2: List[Char] = """ + $show(res$2));$skip(29); val res$3 = 
	
	"Works".toList.slice(1,3);System.out.println("""res3: List[Char] = """ + $show(res$3))}
	
	
	
	
	
	
	
}
