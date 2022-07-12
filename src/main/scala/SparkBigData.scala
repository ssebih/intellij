
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.SparkSession._

object SparkBigData {
  var ss: SparkSession= null
  /**
   * fonction qui initialise et instancie une session spark
   * @param Env: c'est une variable qui indique l'environnement de l'éxecution de spark app:
   *           -env = true ==> local
   *           -env = false ==> cluster
   */

  def sparkSessiion2(env : Boolean = true) {

    if (env == true){
      System.setProperty("hadoop.home.dir","C:/install/exe&zip")
      ss = SparkSession.builder()
          .master("local")
          .config("spark.sql.crossJoin.enabled", "true")
          .enableHiveSupport()
          .getOrCreate()
    }else{
      val ss: SparkSession = SparkSession.builder()
        .appName("spark-application")
        .config("spark.serializer", "org.apache.spark.serializer.kryoSerializer")
        .config("spark.sql.crossJoin.enabled", "true")
        .enableHiveSupport()
        .getOrCreate()
    }

  }

}
