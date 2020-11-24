package services;

import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {

    private static String path = "target/historico.txt";
    private static FileWriter arquivo;

    public ManipuladorArquivo() {

    }

    public void setCachorro() throws IOException {
        Animal cachorro = new Cachorro();
        write(cachorro.falar());
    }

    public void setGato() throws IOException {
        Animal gato = new Cachorro();
        write(gato.falar());
    }

    public void getHistorico() throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        String data = null;
        while ((data = reader.readLine()) != null) {
            System.out.println(data);
        }
        fileReader.close();
        reader.close();
    }
    private void write(String dado){
        try {
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter conexao = new BufferedWriter(fw);
            conexao.write(dado);
            conexao.newLine();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}