object Q_9 {
  def main(args:Array[String]):Unit = {
//    Question 9: Write a Scala function to remove all spaces from a given string.
    var a = "ashok is a solid data engineer"
    var c = a.split(" ")
    var d = ""
    for (i<- 0 until c.length){
      d =d+c(i)
    }
    println(d)
  }
}
