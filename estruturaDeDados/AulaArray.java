package estruturaDeDados;

public class AulaArray {

    public static void main(String[] args) {

        // int[] caixa = new int[6];

        // caixa[0] = 3;
        // caixa[1] = 8;
        // caixa[2] = 5;
        // caixa[3] = 2;
        // caixa[4] = 9;
        // caixa[5] = 10;
        // caixa[6] = 22;

        int[] caixa = { 3, 8, 5, 2, 9, 10, 22 };

        System.out.println(caixa[5]);

        int tamanhoDoArray = caixa.length;
        System.out.println(tamanhoDoArray);

        for (int i = 0; i < tamanhoDoArray; i++) {
            System.out.println(caixa[i]);
        }
    }

}
