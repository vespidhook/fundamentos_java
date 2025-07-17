public class Switch {
    
    public static void main(String[] args) {
        int diaDaSemana = 2;

        switch(diaDaSemana) {
            case 1:
                System.out.println("O dia da semana é domingo");
                break;
            case 2:
                System.out.println("O dia da semana é segunda");
                break;
            case 3:
                System.out.println("O dia da semana é terça");
                break;
            case 4:
                System.out.println("O dia da semana é quarta");
                break;
            default:
                System.out.println("O dia da semana é inválido");
                break;        
        }
    }
}
