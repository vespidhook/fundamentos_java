public class Metodo {

    public static void main(String[] args) {
        meuMetodoSemArgumento();
        meuMetodoComArgumento("Argumento de teste");
        meuMetodoComMaisDeUmArgumento("Argumento de teste 1", "Arumento de teste 2");

        int resultado = calcularNumero(3, 78);
        System.out.println("O resultado da soma é " + resultado);

        metodoComOutroMetodo();        
    }

    public static void meuMetodoSemArgumento(){
        System.out.println("Método sem argumento");
    }

    public static void meuMetodoComArgumento(String argumento1){
        System.out.println("Metodo com argumento " + argumento1);
    }

    public static void meuMetodoComMaisDeUmArgumento(String arg1, String arg2){
        System.out.println("Metodo com argumento " + arg1 + ' ' + arg2);
    }

    public static int calcularNumero(int numero1, int numero2){
        int soma = numero1 =  numero2;

        return soma;
    }

    public static void metodoComOutroMetodo() {
        int resultado = calcularNumero(3,55);
        meuMetodoSemArgumento();
        System.out.println("O resultado da soma é " + resultado);
    }
     
}
