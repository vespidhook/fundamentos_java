package entradaSaida;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class leituraEscrita {

    public static void main(String[] args) throws IOException {
        // FileReader fileReader = new FileReader("novoArquivo.txt");

        // int i;

        // while ((i = fileReader.read()) != -1) {
        // System.out.println((char) i);
        // System.out.println(" ");
        // }

        FileWriter escrita = new FileWriter("novoArquivo.txt");
        escrita.append("Olá, este é um teste de escrita em arquivo.");
        // escrita.write("Olá, este é um teste de escrita em arquivo.");
        escrita.append("Um novo texto foi adicionado.");
        escrita.append("\nEste é um exemplo de escrita em arquivo com Java.");
        escrita.close();
    }

}
