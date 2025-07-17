public class Aluno {

    String nome;
    int idade;
    double nota1;
    double nota2;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média Final: " + calcularMedia());
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Bruno Alves", 17, 7.5, 8.0);
        aluno1.exibirInformacoes();
    }
}
