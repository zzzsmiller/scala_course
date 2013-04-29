package week0001
import scala.collection.immutable.Stack


object Sheet_hw2_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(129); 


	var chars= "(if (zero? x) max (/ 1 x))".toList;System.out.println("""chars  : List[Char] = """ + $show(chars ));$skip(206); 

  def foreach(chars: List[Char], ch: Char):Int = {
      val range = 0 to chars.length-1 by 1
      for (i <- range) {
          if (ch.equals(chars(i)))
            return i
      }
      return -1
    };System.out.println("""foreach: (chars: List[Char], ch: Char)Int""");$skip(54); 
        
        
    val left = foreach(chars, '(');System.out.println("""left  : Int = """ + $show(left ));$skip(37); ;
    var right = foreach(chars, ')');System.out.println("""right  : Int = """ + $show(right ));$skip(37); ;
    
    val dk = chars.slice(0, 3);System.out.println("""dk  : List[Char] = """ + $show(dk ));$skip(45); ;
    val kd = chars.slice(7+1, chars.length);System.out.println("""kd  : List[Char] = """ + $show(kd ));$skip(73); ;

  val newChars = chars.slice(0, 3).++(chars.slice(7 + 1, chars.length));System.out.println("""newChars  : List[Char] = """ + $show(newChars ));$skip(28); 

  var stack = new Stack();System.out.println("""stack  : scala.collection.immutable.Stack[Nothing] = """ + $show(stack ));$skip(472); ;
    def loop(chars: List[Char]): Char = {
      println("\n -------------- \n" + chars);
      if (chars.isEmpty) { return ' ' };
      if (chars(0).equals('(')) {
        stack.push(chars(0));
        return loop(chars.drop(1))
      } else if (chars(0).equals(')')) {
        if (stack.size == 0) {
          return ')'
        } else {
          stack.pop;
          return loop(chars.drop(1))
        }
      } else {
        return loop(chars.drop(1))
      }

    };System.out.println("""loop: (chars: List[Char])Char""");$skip(37); 
    
    
    val res = loop(chars);System.out.println("""res  : Char = """ + $show(res ));$skip(38); ;
    println("\n\n\n -------- \n"+res);$skip(19); 
    println(stack);$skip(37); val res$0 = 
    (res == ' ' && stack.size == 0);;System.out.println("""res0: Boolean = """ + $show(res$0))}
    
     
    
    
    
}
