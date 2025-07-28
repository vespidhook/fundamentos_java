package entradaSaida;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite seu nome:");
        // String nome = scanner.nextLine();

        // System.out.println("Digite sua idade:");
        // int idade = scanner.nextInt();

        // System.out.println("Seu nome é: " + nome);
        // System.out.println("Sua idade é: " + idade);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        System.out.println("Digite outro número");
        int outroNumero = scanner.nextInt();

        int soma = numero + outroNumero;
        System.out.println("A soma dos números é: " + soma);

    }

}
