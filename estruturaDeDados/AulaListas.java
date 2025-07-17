package estruturaDeDados;

import java.util.ArrayList;
import java.util.LinkedList;

public class AulaListas {

    public static void main(String[] args) {

        ArrayList<String> listaSequencial = new ArrayList<>();

        listaSequencial.add("Bruno");
        listaSequencial.add("Joice");
        listaSequencial.add("Helena");

        // System.out.println(listaSequencial.get(0));

        // listaSequencial.remove(0);
        listaSequencial.remove("Joice");

        // System.out.println(listaSequencial);

        LinkedList<String> listaEncadeada = new LinkedList<>();
        listaEncadeada.add("Bruno");
        listaEncadeada.add("Joice");
        listaEncadeada.add("Helena");

        System.out.println(listaEncadeada);

        listaEncadeada.addFirst("Primeiro");
        listaEncadeada.addLast("Ultimo");

        listaEncadeada.peekFirst();
        listaEncadeada.peekLast();

        listaEncadeada.pollFirst();
        listaEncadeada.pollLast();

        boolean contemNome = listaEncadeada.contains("Bruno");
        System.out.println("Contém Bruno? " + contemNome);

        listaEncadeada.contains(listaEncadeada.get(0));
        listaEncadeada.set(0, "Novo Primeiro");

        int indexEncontrado = listaEncadeada.indexOf("Helena");
        System.out.println("Índice de Helena: " + indexEncontrado);

        // System.out.println(listaEncadeada);
        // System.out.println(listaEncadeada.get(0));
        // listaEncadeada.remove(0);
        System.out.println(listaEncadeada);
    }

}
