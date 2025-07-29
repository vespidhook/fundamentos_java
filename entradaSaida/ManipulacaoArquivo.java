package entradaSaida;

import java.io.File;
import java.io.IOException;

public class ManipulacaoArquivo {

    public static void main(String[] args) throws IOException {
        File file = new File("entradaSaida");

        // System.out.println("É um arquivo? " + file.isFile());
        // System.out.println("É um diretório? " + file.isDirectory());
        // System.out.println("O tamanho do arquivo é: " + file.length() + " bytes");
        // System.out.println("Ultima modificação: " + file.lastModified());

        if (file.isDirectory()) {
            String[] arquivos = file.list();
            System.out.println("Arquivos no diretório:");
            for (String arquivo : arquivos) {
                System.out.println(arquivo);
            }
        } else {
            System.out.println("O caminho especificado não é um diretório.");
        }
    }

}
