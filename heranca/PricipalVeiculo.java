package heranca;

public class PricipalVeiculo {

    public static void main(String[] args) {
        // Carro carro = new Carro(4, true, "Toyota");
        // carro.ligar();

        // Moto moto = new Moto("Yamaha", "350");
        // moto.ligar();

        // Veiculo carro = new Carro(2, false, "Fiat");
        // carro.ligar();
        // carro.mostrarDetalhes();

        Aviao aviao = new Aviao();
        aviao.desligar();
        aviao.documentacao();
        aviao.combustivel();
    }

}
