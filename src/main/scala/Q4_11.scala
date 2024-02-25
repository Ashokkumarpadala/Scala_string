object Q4_11 {

    def main(args:Array[String]):Unit = {
      //    Question 4: Write a Scala function to find the length of the longest word in a sentence.
      val a = "ashok is a solid Data engineer"
      var b = a.split(" ")
      var length_1 =b(0).length
      for (i<- 0 until b.length){
        if (b(i).length > length_1){
        length_1= b(i).length }
      }
      println(length_1)
      }



}
