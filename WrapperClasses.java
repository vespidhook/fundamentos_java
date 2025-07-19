import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    public static void main(String[] args) {

        /**
         * byte = Byte
         * short = Short
         * int = Integer
         * long = Long
         * float = Float
         * double = Double
         * char = Character
         * boolean = Boolean
         */

        int numero = 10;
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(numero);
        Integer numeroI = 10;
        numeroI = 12;
        int primeiroItem = listaDeNumeros.get(0);

        // auto-boxing
        Integer numeroII = 20; // int to Integer
        // unboxing
        int numeroIII = numeroII; // Integer to int
    }
}
