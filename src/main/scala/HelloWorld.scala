import scala.collection.mutable._



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

    tesFor()

    collectionScala()

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
  // boucles / -1 boucle While
  def testWhile (valeur_conditionnelle: Int): Unit ={
    var i: Int = 0
    while (i< valeur_conditionnelle){
      println("itération while N° "+i)
      i=i+1
    }


  }
  // Boucles /-2 boucle for
  def tesFor(): Unit ={
    var i:Int = 0
    for (i <- 0 to 15 by 2 ){
      println("itération for N° "+i)

    }


    }


  // création de List adns scala
  def collectionScala(): Unit = {
    val ma_liste: List[Int] = List(1, 2, 3, 5, 45, 15)
    val liste_s: List[String] = List("Salim", "Sarah", "Manel")
    val chaine: String = "ma chaine"
    val plage_v: List[Int] = List.range(1, 15, 2)
    println(ma_liste(0))
    println(plage_v(2))
    println(plage_v)
  }

}
