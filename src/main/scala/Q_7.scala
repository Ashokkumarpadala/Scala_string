object Q_7 {
  // Question 7: Implement a Scala function to count the number of vowels in a given string.
  def main(args:Array[String]):Unit = {
    var count = 0
    var s = "ashok is a solid data engineer"
    for (i<- 0 until s.length){
      if (s(i) == 'a' ||s(i)=='e' ||s(i)=='i' ||s(i)=='o'||s(i)=='u'){
        count = count+1
      }

    }
    println(count)
  }


}
