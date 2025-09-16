package thread;

import java.nio.channels.Pipe.SourceChannel;

public class Contador extends Thread {

    private String threadName;
    private int tempo;

    public Contador(String threadName, int tempo) {
        this.threadName = threadName;
        this.tempo = tempo;
        start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Name: " + threadName + " : " + i);
            try {
                Thread.sleep(this.tempo);
            } catch (Exception e) {
                System.out.println("Deu ruim " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador("Thread 1", 100);
        Contador contador2 = new Contador("Thread 2", 1800);

        try {
            if (contador.isAlive()) {
                System.out.println(" A thread 1 ainda esta em execução");
            }
            contador2.join();
        } catch (Exception e) {
            System.out.println("Deu ruim no metodo mai " + e.getMessage());
        }
        System.out.println("Finalizou a execução");
    }
}
