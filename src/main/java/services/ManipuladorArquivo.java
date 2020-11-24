package services;

import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {

    private static String path = "target/historico.txt";
    private static FileWriter arquivo;

    public ManipuladorArquivo() {

    }

    public void setCachorro() throws IOException {
        Animal gato = new Gato();
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = gato.falar();
        Scanner in = new Scanner(System.in);
        linha = in.nextLine();
        buffWrite.append(linha);
        buffWrite.close();
    }

    public void setGato() throws IOException {
        System.out.println("dfdfd");
    }

    public void getHistorico() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}