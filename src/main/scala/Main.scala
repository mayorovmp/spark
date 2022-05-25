import org.apache.spark.SparkConf
import org.apache.spark.api.java.{JavaRDD, JavaSparkContext}


object Main extends App {
  val sc: SparkConf = new SparkConf().setMaster("local[1]").setAppName("test")
  val context = new JavaSparkContext(sc)
  val rdd: JavaRDD[String] = context.textFile("C:\\work\\spark\\src\\main\\resources\\data.txt")
  val newStr = rdd.map(s => s.concat("new"))
  newStr.foreach(println)
}
