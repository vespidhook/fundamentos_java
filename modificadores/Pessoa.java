package modificadores;

public class Pessoa {

    protected int idade;

    static String email = "pessoa@pessoa.com.br";

    public void falar() {
        System.out.println("Olá! A idade é " + this.idade);
    }

    public static void imprimirMensagem() {
        System.out.println("teste");
    }

}
