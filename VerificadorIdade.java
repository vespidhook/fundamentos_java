public class VerificadorIdade {
    public static void main(String[] args) {
        
        int idade = 45;

        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é idoso.");
        }

    }
}
