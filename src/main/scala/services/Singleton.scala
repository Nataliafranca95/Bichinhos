package main.scala.services

import org.apache.spark.sql.{DataFrame, SparkSession}

import scala.io.Source

private class ManipulatingFile {
  protected val pathFile: String = "target/historico.csv"
  protected val sparkSession = createSparkSession()

  def readFile(): DataFrameme = {
    val df = sparkSession.read
      .format("csv")
      .load("source-path")

    df
  }

  def writeFile(value: String): Unit = {
    val dfData:DataFrame= readFile()

    dfData
      .withColumn(col("animal")===enumAplication.mainAplication.gato, "Gato")
      .withColumn(col("animal")===enumAplication.mainAplication.cachorro, "Cachorro")

    dfData
      .writeStream
      .format("csv")
      start()
  }

  def csvSchema = StructType {
    StructType(Array(
      StructField("animal", StringType, true)
    ))
  }

  private def createSparkSession(): SparkSession = {
    val sparkSession = SparkSession.builder.
      master("local")
      .appName("spark session example")
      .getOrCreate()
    sparkSession
  }
}

object Singleton {
  private val manipulatingFile = new ManipulatingFile()

  def setGato(): Unit = {
    manipulatingFile.writeFile(enumAplication.mainAplication.gato)
  }

  def setCachorro(): Unit = {
    manipulatingFile.writeFile(enumAplication.mainAplication.cachorro)
  }

  def getHistorico(): String = {
    println(manipulatingFile.readFile().show())
  }
}
