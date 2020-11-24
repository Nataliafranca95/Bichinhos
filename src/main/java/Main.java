import services.Animal;
import services.Cachorro;
import services.Gato;
import services.ManipuladorArquivo;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputTerminal = "-";
        ManipuladorArquivo instancia = new ManipuladorArquivo();

        do {
            System.out.println("Digite: \n 1 para gato \n 2 para cachorro \n histórico \n sair");
            inputTerminal = JOptionPane.showInputDialog("=>");

            switch (inputTerminal) {
                case "1":
                    instancia.setGato();
                case "2":
                    instancia.setCachorro();
                case "histórico":
                    instancia.getHistorico();
                default:
                    System.out.println("Tente novamente");
            }
        } while ((inputTerminal.equals("sair")) || (inputTerminal.equals("histórico")));
    }
}
