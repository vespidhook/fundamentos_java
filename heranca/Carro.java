package heranca;

public class Carro extends Veiculo {

    int numeroDePortas;
    boolean temArCondicionado;

    Carro(int numeroDePortas, boolean temArCondicionado, String marca) {
        super(marca);
        this.numeroDePortas = numeroDePortas;
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public void ligar() {
        System.out.println("O carro esta ligando!");
    }
}
