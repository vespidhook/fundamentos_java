package heranca;

public class Aviao implements ContratoVeiculo, ContratoVeiculo2 {

    @Override
    public void desligar() {
        System.out.println("O avião esta desligando");
    }

    @Override
    public void documentacao() {
        System.out.println("Documentação em dia");
    }

    @Override
    public void combustivel() {
        System.out.println("Abastecendo o avião");
    }

}
