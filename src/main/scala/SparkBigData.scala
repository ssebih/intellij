
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.SparkSession._






object SparkBigDataSession {
  var ss : SparkSession= null

  def main(args: Array[String]): Unit = {
    val sparkss= sessionSpark(true).sparkContext
    val rddTest : RDD[String] = sparkss.parallelize(List("Salim","Sarah","Manel"))
    rddTest.foreach(e => println(e))
  }


  /**
   * initilisation d'une session spark
   * @param env : indique l'environnement du déploiement de lapp spark :
   *              -1 si env = true ==> en local
   *              -2 sinon déploiement sur cluster
   */

  def sessionSpark (env : Boolean = true) : SparkSession ={
    if (env== true){
      System.setProperty("hadoop.home.dir","C:/install/exe&zip/hadoop")
      ss = SparkSession.builder()
          .master(("local[*]"))
          .config("spark.sql.crossJoin.enabled", "true")
        //  .enableHiveSupport()
          .getOrCreate()
    }else{
       ss = SparkSession.builder()
        .appName("SAPRK_SALIM")
        .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
         .config("spark.sql.crossJoin.enabled", "true")
       // .enableHiveSupport()
         .getOrCreate()

    }

ss

  }




}
