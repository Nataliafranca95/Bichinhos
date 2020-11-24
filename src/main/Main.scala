import enums.enumAplication
import main.scala.services.Singleton

object Main {
  def main(args: Array[String]): Unit = {

    var inputTerminal: String = "0"
    do {
      print("Digite: \n 1 para gato \n 2 para cachorro \n histórico \n sair \n =>")
      inputTerminal = scala.io.StdIn.readLine()

      inputTerminal match {
        case enumAplication.mainAplication.gato => Singleton.setGato()
        case enumAplication.mainAplication.cachorro => Singleton.setCachorro()
        case enumAplication.mainAplication.historico => Singleton.getHistorico()
        case _ => println("Tente novamente")
      }
    } while (inputTerminal != enumAplication.mainAplication.sair ||
      inputTerminal == enumAplication.mainAplication.historico)
  }
}