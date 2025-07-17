public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void dizerOla() {
        System.out.println("Olá, meu nome é " + this.nome);
    }
}
