object Q_1 {
  def main(args: Array[String]): Unit = {

//    Question 1: Write a Scala function to count the occurrences of a specific character in a given string.
  val a = "ashok is a solid Data engineer"
  val d = 'a'
  var count = 0
    for (i<- 0 until  a.length()){
    if (a(i) == d){
      count= count+1
    }
    }
    println(count)
  }
}
