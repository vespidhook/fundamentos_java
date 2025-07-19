public class ManioulacaoString {

    public static void main(String[] args) {

        String str = " Hello, World!";
        int tamanho = str.length();
        System.out.println("O tamanho da string é: " + tamanho);

        System.out.println("================");

        // SUBSTRING
        String subStr = str.substring(0, 5);
        System.out.println("Substring: " + subStr);

        System.out.println("================");

        System.out.println("String em minúsculas: " + str.toLowerCase());
        System.out.println("String em maiúsculas: " + str.toUpperCase());

        System.out.println("================");

        String replace = str.replace("World", "Java");
        System.out.println("String após substituição: " + replace);

        System.out.println("================");

        String[] palavras = str.split(" ");
        System.out.println("Palavras na string:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        System.out.println("================");

        String[] stringSplit = str.split(" ");
        System.out.println(stringSplit[0]); // Imprime "Hello,"
        System.out.println(stringSplit[1]); // Imprime "World!"

        System.out.println("================");

        String strTrim = "   Hello, World!   ";
        System.out.println("String original: '" + strTrim + "'");
        System.out.println("String após trim: '" + strTrim.trim() + "'");

        System.out.println("================");

        System.out.println(str.startsWith("Hello")); // true
        System.out.println(str.endsWith("!")); // true
        System.out.println(str.contains("World")); // true
    }
}
