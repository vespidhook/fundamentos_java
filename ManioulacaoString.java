public class ManioulacaoString {

    public static void main(String[] args) {

        String str = "Hello, World!";
        int tamanho = str.length();
        System.out.println("O tamanho da string é: " + tamanho);

        // SUBSTRING
        String subStr = str.substring(0, 5);
        System.out.println("Substring: " + subStr);

        System.out.println("String em minúsculas: " + str.toLowerCase());
        System.out.println("String em maiúsculas: " + str.toUpperCase());

    }
}
