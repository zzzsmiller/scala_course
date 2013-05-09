package scala.week05

import scala.util.Random
import scala.common._

object Sheet_HOFList {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val l = List(3, 4, 1, 0)                        //> l  : List[Int] = List(3, 4, 1, 0)

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case x :: xs1 => x * x :: squareList(xs1)
  }                                               //> squareList: (xs: List[Int])List[Int]

  squareList(l)                                   //> res0: List[Int] = List(9, 16, 1, 0)

  def squareList2(xs: List[Int]): List[Int] =
    xs map (x => x * x)                           //> squareList2: (xs: List[Int])List[Int]

  squareList2(l)                                  //> res1: List[Int] = List(9, 16, 1, 0)

  def mypack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case y :: ys => {
      val (taken, rest) = ys span (x => x == y)
      List(y :: taken) ::: pack(rest)
    }
  }                                               //> mypack: [T](xs: List[T])List[List[T]]
  
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case y :: ys =>{
      val (taken, rest) = xs span (x => x == y)
      taken :: pack(rest)
    }
  }                                               //> pack: [T](xs: List[T])List[List[T]]
  
  def encode[T](xs: List[T]): List[(T, Int)] =
  	pack(xs) map ( x => (x.head, x.length) )  //> encode: [T](xs: List[T])List[(T, Int)]
  		
  	
  

	val rand = new Random(100)                //> rand  : scala.util.Random = scala.util.Random@10e07658
  pack(List("a", "a", "a", "b", "c", "c", "a"))   //> res2: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
  encode(List("a", "a", "a", "b", "c", "c", "a")) //> res3: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
     
     
  def makeRandomList(xs: List[Int], num: Int): List[Int] = {
    if (num <= 0) xs
    else makeRandomList(rand.nextInt :: xs, num - 1)
  }                                               //> makeRandomList: (xs: List[Int], num: Int)List[Int]
  
  val longList = makeRandomList(Nil, 3000)        //> longList  : List[Int] = List(-911141062, 359380611, 1617620587, -1789790809
                                                  //| , -481782211, -1829387572, 750870665, -143513797, 725371035, 100610803, 115
                                                  //| 3766564, 925989985, -837495254, 633987314, -720470030, -1599050812, -163410
                                                  //| 1998, 1922859556, -1726894036, -1059580520, -1055089921, -1309691485, 46322
                                                  //| 2233, -38840429, -2107944055, 198659300, 117064157, 674552110, 419547103, 4
                                                  //| 61602449, 203571778, -956625892, 529793978, 1173820326, 304712261, -4748978
                                                  //| 2, 1851933568, 397342415, 494129571, 1006243992, -2022058057, 1982918143, 1
                                                  //| 137350436, 892635288, 310241709, -1416759725, -284118424, -1599083131, 1899
                                                  //| 531620, -501818839, 249143537, 1681291333, 1757793475, -1810899588, -519349
                                                  //| 647, 442882083, 1270323194, -530932606, -300107692, 419524870, 1085982517, 
                                                  //| 538146951, 1169800336, 919039478, -598042236, -1673384181, 265962412, 74028
                                                  //| 7441, -1530831606, -734300390, 199683598, 2101444680, -2130563996, 20035504
                                                  //| 43, -1901900664, 535265
                                                  //| Output exceeds cutoff limit.
  


//val longList2 = makeRandomList(Nil, 100000)

time(mypack(longList))                            //> Elapsed time: 46139663ns
                                                  //| res4: List[List[Int]] = List(List(-911141062), List(359380611), List(161762
                                                  //| 0587), List(-1789790809), List(-481782211), List(-1829387572), List(7508706
                                                  //| 65), List(-143513797), List(725371035), List(100610803), List(1153766564), 
                                                  //| List(925989985), List(-837495254), List(633987314), List(-720470030), List(
                                                  //| -1599050812), List(-1634101998), List(1922859556), List(-1726894036), List(
                                                  //| -1059580520), List(-1055089921), List(-1309691485), List(463222233), List(-
                                                  //| 38840429), List(-2107944055), List(198659300), List(117064157), List(674552
                                                  //| 110), List(419547103), List(461602449), List(203571778), List(-956625892), 
                                                  //| List(529793978), List(1173820326), List(304712261), List(-47489782), List(1
                                                  //| 851933568), List(397342415), List(494129571), List(1006243992), List(-20220
                                                  //| 58057), List(1982918143), List(1137350436), List(892635288), List(310241709
                                                  //| ), List(-1416759725), List(-284118424), List(-1599083131), List(1899531620
                                                  //| Output exceeds cutoff limit.

time(pack(longList))                              //> Elapsed time: 25199014ns
                                                  //| res5: List[List[Int]] = List(List(-911141062), List(359380611), List(161762
                                                  //| 0587), List(-1789790809), List(-481782211), List(-1829387572), List(7508706
                                                  //| 65), List(-143513797), List(725371035), List(100610803), List(1153766564), 
                                                  //| List(925989985), List(-837495254), List(633987314), List(-720470030), List(
                                                  //| -1599050812), List(-1634101998), List(1922859556), List(-1726894036), List(
                                                  //| -1059580520), List(-1055089921), List(-1309691485), List(463222233), List(-
                                                  //| 38840429), List(-2107944055), List(198659300), List(117064157), List(674552
                                                  //| 110), List(419547103), List(461602449), List(203571778), List(-956625892), 
                                                  //| List(529793978), List(1173820326), List(304712261), List(-47489782), List(1
                                                  //| 851933568), List(397342415), List(494129571), List(1006243992), List(-20220
                                                  //| 58057), List(1982918143), List(1137350436), List(892635288), List(310241709
                                                  //| ), List(-1416759725), List(-284118424), List(-1599083131), List(1899531620
                                                  //| Output exceeds cutoff limit.

  //List(List("a", "a", "a"), List("b"), List("c", "c"), List("a"))
}