public class CriarObjetoContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = "123456";
        conta.depositar(0);

        System.out.println(conta.numeroConta);
        System.out.println("O saldo é " + conta.getSaldo());
        conta.sacar(600);
        System.out.println("O saldo é " + conta.getSaldo());
    }

}
