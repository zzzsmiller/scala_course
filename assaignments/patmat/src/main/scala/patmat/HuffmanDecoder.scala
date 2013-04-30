package patmat

import patmat.Huffman._

object HuffmanDecoder {
  def main(args: Array[String]) = {
    
    /*println(Huffman.decodedSecret)
    val enc = Huffman.encode(Huffman.frenchCode)(Huffman.decodedSecret)
    println(enc)
    println("----------")
    println(Huffman.secret)
    println("=========")
    println("The answer is " + Huffman.secret.equals(enc))*/
    
    
    /*val enc2 = Huffman.encode(Huffman.frenchCode)("huffmanestcool".toList)
    println("*********************")
    println(Huffman.secret)
    println("=========")
    println("The answer is " + Huffman.secret.equals(enc))*/
    
    
    
//    decode(Huffman.frenchCode, encode(Huffman.frenchCode)("huffmanestcool".toList)) === "huffmanestcool".toList
    
    /*val sentense = List('h', 'u', 'f', 'f', 'm', 'a', 'n', 'e', 's', 't', 'c', 'o', 'o', 'l')
    Huffman.encode(Huffman.frenchCode)(sentense)
    val dec = Huffman.decode(Huffman., bits)
    println(enc)
    println("----------")
    println(Huffman.secret)
    println("=========")
    println("The answer is " + Huffman.secret.equals(enc))*/
    
    
    println("----------")
    
    
    println("encode 'bad'")
    val t2 = Fork(Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5), Leaf('d', 4), List('a', 'b', 'd'), 9)
    val enc22 = encode(t2)("bad".toList)
    println(enc22)
    println(decode(t2, enc22))
    println("----------")
    println("----------")

    val l = List(3, 4, 13)
    println(l ::: List(88))
    
    val lnil = Nil
    println(lnil ::: List(88))

  }
}