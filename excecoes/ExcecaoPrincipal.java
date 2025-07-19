package excecoes;

public class ExcecaoPrincipal {

    public static void main(String[] args) {

        // try
        // catch
        // finally

        String[] array = new String[5];

        try {
            System.out.println(array[10]);
            System.out.println("Linha 16");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você tentou acessar um índice fora dos limites do array.");
        } finally {
            System.out.println(
                    "Este bloco é executado sempre, independentemente de uma exceção ter sido lançada ou não.");
        }

        System.out.println("Linha 24");

        try {
            lancarExcecao(122);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static void lancarExcecao(int numero) throws Exception {

        if (numero > 10) {
            throw new Exception("Número deve ser negativo");
        }

        System.out.println("Número é válido: " + numero);
    }

}
