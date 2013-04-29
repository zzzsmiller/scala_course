package week0001
import scala.collection.immutable.Stack


object Sheet_hw2_2 {


	var chars= "(if (zero? x) max (/ 1 x))".toList
                                                  //> chars  : List[Char] = List((, i, f,  , (, z, e, r, o, ?,  , x, ),  , m, a, x
                                                  //| ,  , (, /,  , 1,  , x, ), ))

  def foreach(chars: List[Char], ch: Char):Int = {
      val range = 0 to chars.length-1 by 1
      for (i <- range) {
          if (ch.equals(chars(i)))
            return i
      }
      return -1
    }                                             //> foreach: (chars: List[Char], ch: Char)Int
        
        
    val left = foreach(chars, '(');               //> left  : Int = 0
    var right = foreach(chars, ')');              //> right  : Int = 12
    
    val dk = chars.slice(0, 3);                   //> dk  : List[Char] = List((, i, f)
    val kd = chars.slice(7+1, chars.length);      //> kd  : List[Char] = List(o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), )
                                                  //| )

  val newChars = chars.slice(0, 3).++(chars.slice(7 + 1, chars.length))
                                                  //> newChars  : List[Char] = List((, i, f, o, ?,  , x, ),  , m, a, x,  , (, /,  
                                                  //| , 1,  , x, ), ))

  var stack = new Stack();                        //> stack  : scala.collection.immutable.Stack[Nothing] = Stack()
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

    }                                             //> loop: (chars: List[Char])Char
    
    
    val res = loop(chars);                        //> 
                                                  //|  -------------- 
                                                  //| List((, i, f,  , (, z, e, r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x
                                                  //| , ), ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List(i, f,  , (, z, e, r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, )
                                                  //| , ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List(f,  , (, z, e, r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), )
                                                  //| )
                                                  //| 
                                                  //|  -------------- 
                                                  //| List( , (, z, e, r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List((, z, e, r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List(z, e, r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List(e, r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List(r, o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List(o, ?,  , x, ),  , m, a, x,  , (, /,  , 1,  , x, ), ))
                                                  //| 
                                                  //|  -------------- 
                                                  //| List(?,  , x,
                                                  //| Output exceeds cutoff limit.
    println("\n\n\n -------- \n"+res)             //> 
                                                  //| 
                                                  //| 
                                                  //|  -------- 
                                                  //| )
    println(stack)                                //> Stack()
    (res == ' ' && stack.size == 0);              //> res0: Boolean = false
    
     
    
    
    
}