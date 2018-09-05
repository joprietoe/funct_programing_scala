package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
        if((c == 0 || r == 0) || c == r) 1 
        else pascal(c-1,r-1) + pascal(c,r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      
      @annotation.tailrec
      def auxBalance(chars: List[Char], bal: Int): Boolean = {
        if(bal < 0) false
        /*else if(chars.isEmpty && bal == 0) true 
        else if (chars.isEmpty && bal != 0) false*/
        else if(chars.isEmpty) bal == 0
        else if(chars.head == '(') auxBalance(chars.tail, bal + 1)
        else if(chars.head == ')') auxBalance(chars.tail, bal - 1)
        else auxBalance(chars.tail, bal)
      }
      auxBalance(chars,0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
<<<<<<< HEAD
      if (coins.isEmpty || money < 0) 0
      else if (money == 0 && !coins.isEmpty) 1
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)

=======
      
      if(coins.isEmpty || money < 0) 0
      else if(money == 0 && !coins.isEmpty) 1
      else  countChange(money - coins.head, coins) +
            countChange(money, coins.tail)

    }
>>>>>>> 6975e293eeafc94690070f1f067315fd176b269d
  }
}
