package estruturaDeDados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AulaSet {
    // SET é uma coleção que não permite elementos duplicados.
    // É útil quando você precisa garantir que todos os elementos sejam únicos.

    public static void main(String[] args) {

        Set<String> conjuntoSet = new HashSet<>();

        conjuntoSet.add("Bruno");
        conjuntoSet.add("Joice");
        conjuntoSet.add("Helena");
        conjuntoSet.add(null); // Permite um elemento nulo

        System.out.println(conjuntoSet);

        conjuntoSet.add("Bruno"); // Tentativa de adicionar um elemento duplicado
        System.out.println(conjuntoSet); // O conjunto não permite duplicatas

        conjuntoSet.remove("Joice"); // Remove um elemento do conjunto
        System.out.println(conjuntoSet);

        boolean contem = conjuntoSet.contains("Bruno");
        System.out.println("Conjunto contém Bruno? " + contem);

        System.out.println("===================================");

        Set<String> conjuntoTreeSet = new TreeSet<>();

        conjuntoTreeSet.add("Bruno");
        conjuntoTreeSet.add("Joice");
        conjuntoTreeSet.add("Helena");
        conjuntoTreeSet.add("Ana");
        conjuntoTreeSet.add("Carlos");

        System.out.println(conjuntoTreeSet);

        // conjuntoTreeSet.add(null); // TreeSet não permite elementos nulos, isso
        // causará NullPointerException
        // conjuntoTreeSet.add(null); // Descomente esta linha para ver o erro

        conjuntoTreeSet.remove("Bruno"); // Remove um elemento do conjunto

        System.out.println(conjuntoTreeSet); // Os elementos são ordenados automaticamente
    }

}
