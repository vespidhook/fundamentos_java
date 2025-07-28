public class ContaBancaria {

    String numeroConta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) throws SaldoInsuficienteException {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    public void sacar(double valor) throws SacarException {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            throw new SacarException();
        }
    }
}
