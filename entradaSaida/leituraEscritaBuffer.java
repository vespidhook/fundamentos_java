package entradaSaida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class leituraEscritaBuffer {

    public static void main(String[] args) throws IOException {
        // BufferedReader reader = new BufferedReader(new
        // FileReader("novoArquivo.txt"));

        // String linha;
        // while ((linha = reader.readLine()) != null) {
        // System.out.println(linha);
        // }
        // reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("novoArquivo.txt", true));
        writer.write("Primeira linha do arquivo\n");
        writer.write("Segunda linha do arquivo\n");
        writer.write("Terceira linha do arquivo\n");
        writer.write("Quarta linha do arquivo\n");
        writer.write("Texto parcial", 0, 12);

        writer.close();
    }
}
