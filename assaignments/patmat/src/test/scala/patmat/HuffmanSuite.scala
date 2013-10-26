package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
  trait TestTrees {
    val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
    val t2 = Fork(Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5), Leaf('d', 4), List('a', 'b', 'd'), 9)
  }

  test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }

  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a', 'b', 'd'))
    }
  }

  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }

  test("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 3)))
  }

  test("combine of some leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(combine(leaflist) === List(Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3), Leaf('x', 4)))
  }
  
  test("combine of Nil") {
    assert(combine(Nil) === List())
  }

  test("decode and encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }

  test("decode and encode a very short text should be identity 2") {
    assert(decode(frenchCode, encode(frenchCode)("huffmanestcool".toList)) === "huffmanestcool".toList)    
  }

  test("decode and encode a very short text should be identity 3") {
    new TestTrees {
      assert(decode(t2, quickEncode(t2)("bad".toList)) === "bad".toList)
    }
  }
  
  test("decode and quick encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, quickEncode(t1)("ab".toList)) === "ab".toList)
    }
  }

  test("decode and quick encode a very short text should be identity 2") {
    assert(decode(frenchCode, quickEncode(frenchCode)("huffmanestcool".toList)) === "huffmanestcool".toList)    
  }

  test("decode and quick encode a very short text should be identity 3") {
    new TestTrees {
      assert(decode(t2, encode(t2)("bad".toList)) === "bad".toList)
    }
  }

  
  test("convert t1") {
    new TestTrees {
      assert(convert(t1) === List(('a', List(0)), ('b', List(1))))
    }
  }
  
  test("convert t2") {
    new TestTrees {
      assert(convert(t2) === List(('a', List(0, 0)), ('b', List(0,1)), ('d', List(1))))
    }
  }

  test("times function") {
    assert(times(List('a', 'b', 'a', 'b', 'a', 'a'))
      === List(('a', 4), ('b', 2)))

    assert(times(List('c', 'd', 'a', 'd', 'a', 'a'))
      === List(('c', 1), ('d', 2), ('a', 3)))
  }

  test("until function") {
    assert(until(singleton, combine)(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)))) != List(Leaf('d', 2)))
    assert(singleton(until(singleton, combine)(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))))))
  }
  
  test("create Code Tree") {
    new TestTrees {
    	assert(createCodeTree("babddbdd".toList) != t2)
    	val someText = "someText".toList
    	val tree = createCodeTree(someText)
    	println(encode(tree)(someText))
    	println(tree.toString())
    }
    
  }
}
