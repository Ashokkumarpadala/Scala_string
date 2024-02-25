object Q_5 {

  def main(args:Array[String]):Unit = {
//    Question 5: Create a Scala function to check if two strings are anagrams.
    var a = "ashok"
    var b = "kohs"
    var c:List[Char] = List()
    var d:List[Char]= List()
    for (i<- 0 until a.length){
      c= c:+a(i) }
    for (i<- 0 until b.length){
      d= d:+b(i)  }
    if ((c.sorted == d.sorted ) && (a.length ==b.length)){
      println("Its anagram")
    }
    else{ println("it is not anagram")}

  }



}
