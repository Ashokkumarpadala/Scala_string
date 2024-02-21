object String_palindrome {
  def main(args: Array[String]): Unit = {
    var c= "Apple"
    var d = ""
    for (i<- c.length-1 to 0 by -1){
      d=d+c(i)
    }
    if (c==d){
      println("it is palindrome")
    }
    else{
      println("it is not palindrome")
    }
  }

}
