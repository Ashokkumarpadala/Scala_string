object Q_8 {
  def main(args:Array[String]):Unit = {
//    Question 8: Given a string, write a Scala function to reverse the order of words in it.
    var s = "ashok is a solid data engineer"
    var r = ""
    var c = s.split(" ")

    for (i<- c.length-1 to 0 by -1){

      r = r+c(i)
    }
    println(r)
  }
}
