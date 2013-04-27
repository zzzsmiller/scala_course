package week03

object Sheet_IntSet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(53); 
	val s1 = Empty;System.out.println("""s1  : week03.Empty.type = """ + $show(s1 ));$skip(40); 
	var s2 = new NonEmpty(5, Empty, Empty);System.out.println("""s2  : week03.NonEmpty = """ + $show(s2 ));$skip(16); 
	s2 = s2 incl 3;$skip(17); 
	s2 = s2 incl 67;$skip(4); val res$0 = 
	s2;System.out.println("""res0: week03.NonEmpty = """ + $show(res$0));$skip(42); 
	
	var s3 = new NonEmpty(7, Empty, Empty);System.out.println("""s3  : week03.NonEmpty = """ + $show(s3 ));$skip(16); 
	s3 = s3 incl 3;$skip(16); 
	s3 = s3 incl 5;$skip(16); 
	s3 = s3 incl 1;$skip(4); val res$1 = 
	s3;System.out.println("""res1: week03.NonEmpty = """ + $show(res$1));$skip(15); val res$2 = 
	
	s2 union s3;System.out.println("""res2: week03.IntSet = """ + $show(res$2))}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

object Empty extends IntSet {
  def incl(x: Int) = new NonEmpty(x, Empty, Empty)

  def contains(x: Int) = false

  def union(other: IntSet) = other

  override def toString() = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int) = {
    if (x < elem) left contains x
    else if (x > elem) right contains (x)
    else true
  }

  def incl(x: Int) = {
    if (x < elem) new NonEmpty(elem, left.incl(x), right)
    else if (x > elem) new NonEmpty(elem, left, right.incl(x))
    else this
  }

  def union(other: IntSet) = {
    var unionSet: IntSet = other
    if (!other.contains(elem)) unionSet = other.incl(elem)
    unionSet = left union unionSet
    unionSet = right union unionSet
    unionSet
  }

  override def toString() = "{" + left + elem + right + "}"
}
