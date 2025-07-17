package modificadores;

public class PessoaPricipal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.falar();

        pessoa.idade = 35;
        Pessoa.email = "teste@oi.com";

        System.out.println(Pessoa.email);
        Pessoa.imprimirMensagem();
    }
}
