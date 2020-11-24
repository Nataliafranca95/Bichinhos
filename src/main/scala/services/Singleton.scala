package main.scala.services

import java.io.{BufferedWriter, File, FileWriter, PrintWriter}

import enums.enumAplication

import scala.io.Source

private class ManipulatingFile {
  protected val pathFile: String = "target/historico.txt"

  def readFile(): String = {
    val source = scala.io.Source.fromFile(pathFile)
    val lines = try source.mkString finally source.close()
    lines
  }

  def writeFile(value: String): Unit = {
    val file = new File(pathFile)
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(value)
    bw.close()
    print(bw)
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
    manipulatingFile.readFile()
  }
}
