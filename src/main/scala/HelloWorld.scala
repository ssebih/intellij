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

    println("*************fonction dans scala***************")

    getResult(10)

    println("***************boucle while************")

    testWhile(5)

    println("*************boucle for*****************")

    tesFor()

    println("******************collection et list dans scala**********************")

    collectionScala()

    println("***************affichage d'une liste dans scala*******************")

    affichList()

    println("*************manipulation des liste dans scala **********************")

    filterList()

    println("*****************Les Tuples**********")

    println("désifinition des des tuples : Les tuples se sont des collections" +
      " immutables des données hétérogènes, différents types, autant d'éléments" +
      "les listes sont urilisées pour transformer les données des données d'une base de données en list" +
      "puis manipuler ces listes avec les fonctions ittérateurs etc " +
      "")

    collectionTuples()

    println("*********************************les map***************************************")

    hashageMap()

    println("**************Les tableaux ou Array***************************************")

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

  //affichage des éléments d'une liste
  def affichList(): Unit ={
    val ma_liste: List[Int]= List(1,2,3,4,67,765,132)
    for (i<- ma_liste){
      println(i)
    }
  }

  // Fonctions anonymes (expressions lambda) et List dans scala
  def filterList(): Unit ={

    val ma_liste1 : List[String] = List("Salim","Sarah","Manel","Ahmed","Zidane","Said","Sebih")
println("**********Filtrer une liste*******************")
    val filterResults:List[String]=ma_liste1.filter(e => e.startsWith("S")) // expressions lambda
   for (e <- filterResults){

     println(e)

   }
    println("******************mapper une liste****************************")
    val number_e:Int=ma_liste1.count(element => element.startsWith("S"))
    println("nombre d'élements respectant la condition est : " +number_e)
    val ma_liste: List[Int]= List(1,2,3,4,67,765,132)
    val ma_liste2 : List [Int]= ma_liste.map(e=> 2*e)
    for (e<- ma_liste2){
      println(e)
    }
    println("******************mapper une liste en déclarant la valeur de chaque élement e****************************")


    val ma_liste3 :List[Double]= ma_liste.map((e:Int)=>e*0.1)
for (e <- ma_liste3){
  println(e)

}


    println("*************************mapper une liste faire des modification par le _")

    val ma_liste4 :List[Int]= ma_liste.map(_+1)
    for (e <- ma_liste4){
      println(e)
    }

    println("******************creation d'une liste à partir d'une liste en filtrant par des >, < ou = ")

    val nouvelle_liste : List[Int]= ma_liste.filter(element => element>5)

    for (e <- nouvelle_liste){

      println(e)
    }

    println("****************transformation d'une liste*****************")

    val prenom: List[String]= List("sarah", "salim","manel")
    val new_prenom :List[String]= prenom.map(e => e.toUpperCase)

    for (e<- new_prenom){
      println(e)
    }

    println("******************récupérer les informations d'une liste directement sans passer par la boucle for ****************************")

    new_prenom.foreach(e=>  println("nouvelle liste : " +e))

    new_prenom.foreach( println(_))

  }

  class Person (var nom: String, var prenom: String, var age:Int)

  def collectionTuples(): Unit ={


    println("****************manipulation des tuples*********************")


    val tuples_test= (45, "JVC", "False")


    println(tuples_test._2)


    val nouvPersonne : Person= new Person("SEBIH","Salim",35)

    val tupleMixte = ("test", nouvPersonne,"bonjour",90)

    tupleMixte.toString().toList.toString().foreach(e => println(e))


  }



  def hashageMap(): Unit ={
    println("Les map sont des tables de hashage : je crée la valeur et la clé")

    val states= Map(
      "AK"-> "Alaska",
      "Il" -> "Illinois",
      "KY" -> "Kentucky"
    )
    val person = Map(
      "nom" -> "SEBIH",
      "prenom" -> "Saim",
      "Age" -> 35
    )
    person.foreach(e => println(e))
  }


  def tableauDef(): Unit ={

    println("Les tableaux sont un type classique en programmation ce n'est pas une collection au sens propre du terme")


    val maTable: Array[String]= Array("Salim","SEBIH","testTableau")

    maTable.foreach(e=> println(e))
  }

}
