public class CriarObjetoContaBancaria {

    public static void main(String[] args) {

        try {
            ContaBancaria conta = new ContaBancaria();
            conta.numeroConta = "123456";

            System.out.println(conta.numeroConta);
            System.out.println("O saldo é " + conta.getSaldo());
            conta.sacar(600);
            conta.depositar(0);

            System.out.println("O saldo é " + conta.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Saindo do banco.");
        }
    }

}
