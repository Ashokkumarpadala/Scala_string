object String_odd_index {
  def main(args: Array[String]): Unit = {
    var c = "MANGO"

    for (i <- 0 until c.length) {
      if (i % 2 != 0) {
        println(c(i))
      }
    }
  }

}
