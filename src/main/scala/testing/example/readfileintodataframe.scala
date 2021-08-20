package testing.example

import org.apache.spark.sql.{DataFrame, SparkSession}

object readfileintodataframe extends App{

  def readFileFromSession(sparkSession: SparkSession): DataFrame ={
    return sparkSession.read
      .option("header", "true")
      .csv("src/main/resources/Transactions.csv")
  }

  def createSparkSession(): SparkSession = {
    val sparkSession = SparkSession.builder
      .master("local")
      .appName("spark session example")
      .getOrCreate()
    sparkSession
  }
}
