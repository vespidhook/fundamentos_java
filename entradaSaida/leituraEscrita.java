package entradaSaida;

import java.io.FileReader;
import java.io.IOException;

public class leituraEscrita {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("novoArquivo.txt");

        int i;

        while ((i = fileReader.read()) != -1) {
            System.out.println((char) i);
            System.out.println(" ");
        }
    }

}
