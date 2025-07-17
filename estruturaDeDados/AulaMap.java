package estruturaDeDados;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AulaMap {

    public static void main(String[] args) {

        // Map<String, String> contatos = new HashMap<>();
        Map<String, String> contatos = new LinkedHashMap<>();
        contatos.put("Bruno", "bruno@email.com");
        contatos.put("Joice", "joice@email.com");
        contatos.put("Helena", "helena@email.com");
        contatos.put("Bruno", "bruno2@email.com"); // Atualizando o email de Bruno
        contatos.put("Carlos", "carlos@email.com");

        System.out.println(contatos);

        String email = contatos.get("Bruno");
        System.out.println("Email de Bruno: " + email);

        contatos.remove("Joice");
        System.out.println("Contatos após remoção: " + contatos);

        boolean existe = contatos.containsKey("Helena");
        System.out.println("Contatos contém Helena? " + existe);

        for (Map.Entry<String, String> contato : contatos.entrySet()) {
            System.out.println("Chave: " + contato.getKey() + ", Valor: " + contato.getValue());
        }
    }

}
