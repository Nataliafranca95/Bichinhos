import enums.enumAplication
object Main {
  def main(args: Array[String]): Unit = {

    print("Digite: \n 1 para gato \n 2 para cachorro \n histórico \n =>")
    val inputTerminal: String = scala.io.StdIn.readLine()

    inputTerminal match {
      case enumAplication.mainAplication.gato => 1
      case enumAplication.mainAplication.cachorro => 2
      case enumAplication.mainAplication.historico => "two"
      case _ => "other"
    }
  }
}