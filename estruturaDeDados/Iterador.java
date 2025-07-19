package estruturaDeDados;

// import java.util.ArrayList;
// import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterador {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Morango");
        lista.add("Uva");
        lista.add("Melancia");
        lista.add("Abacaxi");

        // Iterator<String> iterator = lista.iterator();
        ListIterator<String> iterator = lista.listIterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
            // if (elemento.equals("Morango")) {
            // iterator.remove();
            // }
        }

        System.out.println("+++++++++++++++++++++++");

        while (iterator.hasPrevious()) {
            String elemento = iterator.previous();
            System.out.println(elemento);
        }
        System.out.println("Lista após remoção:");
    }
}
