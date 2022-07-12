object HelloWorld {
  /*
  premier projet git avec intellij/scala
   */
  val ma_var_immutable : String = "Salim" // variable immutable à portée privée
  private val une_var_immutable : String= "mon test de scala"
  def main(args: Array[String]): Unit = {

    println("Hello World : It's my first project, I am happy")
    var test:Int = 15
    test = test +10
    println(test)
    println(comptage_caracteres("salut les gars"))
    getResult(10)
    testWhile(5)
  }
/*
Ma première fonction
def comptage_caracteres
 */
  def comptage_caracteres (text : String) : Int = {
    if (text.isEmpty){
      return 0
    }
    else{
      return (text.trim.length )
    }

  }
  /*
Ma première procedure (methode)
def comptage_caracteres
 */
  def getResult (parametre : Any): Unit ={
    if (parametre== 10){
      println("votre valeur est un entier")}
      else {
        println("votre valeur est une chaine de caractere")
      }


  }
  // boucles
  def testWhile (valeur_conditionnelle: Int): Unit ={
    var i: Int = 0
    while (i< valeur_conditionnelle){
      println("itération while N° "+i)
      i=i+1
    }

  }
}
