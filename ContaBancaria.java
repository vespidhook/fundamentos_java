public class ContaBancaria {

    String numeroConta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        } else {
            System.out.println("O valor é inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("O seu saldo é insuficiente!");
        }
    }
}
