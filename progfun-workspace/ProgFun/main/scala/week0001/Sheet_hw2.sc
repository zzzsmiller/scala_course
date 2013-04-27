package week01

object Sheet_hw2 {
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
  }                                               //> foreach: (chars: List[Char], start: Int, stop: Int, num: Int)Int

	foreach("Works".toList, "Works".toList.length-1, 0, 0)
                                                  //> starts
                                                  //| s
                                                  //| k
                                                  //| r
                                                  //| o
                                                  //| W
                                                  //| res0: Int = 0
                                                  
  val parathn = Array('(', ')')                   //> parathn  : Array[Char] = Array((, ))

	val cj = ')'                              //> cj  : Char = )
	
	parathn.contains(cj)                      //> res1: Boolean = true
	
	"Works".toList.dropRight(1)               //> res2: List[Char] = List(W, o, r, k)
	
	"Works".toList.slice(1,3)                 //> res3: List[Char] = List(o, r)
	
	
	
	
	
	
	
}