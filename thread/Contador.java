package thread;

<<<<<<<HEAD

import java.nio.channels.Pipe.SourceChannel;

=======>>>>>>>76 a5609aa55ca49d74c97bf6ad6a401bbd4ab2aa

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
<<<<<<< HEAD
            System.out.println("Thread Name: " + threadName + " : " + i);
            try {
                Thread.sleep(this.tempo);
            } catch (Exception e) {
                System.out.println("Deu ruim " + e.getMessage());
=======
            System.out.println("Thread Name: " + threadName + " - Count: " + i);
            try {
                Thread.sleep(this.tempo);
            } catch (InterruptedException e) {
                System.err.println("Thread " + threadName + " was interrupted.");
>>>>>>> 76a5609aa55ca49d74c97bf6ad6a401bbd4ab2aa
            }
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador("Thread 1", 100);
        Contador contador2 = new Contador("Thread 2", 100);
        Contador contador3 = new Contador("Thread 3", 100);

        contador.setPriority(Thread.MIN_PRIORITY);
        contador2.setPriority(Thread.NORM_PRIORITY);
        contador3.setPriority(Thread.MAX_PRIORITY);

        // try {
        // if (contador.isAlive()) {
        // System.out.println("Thread 1 is alive.");
        // }
        // contador.join();
        // if (!contador.isAlive()) {
        // System.out.println("Thread 1 has finished execution.");
        // }
        // } catch (Exception e) {
        // System.err.println("Error checking thread status: " + e.getMessage());
        // }

        // try {
        // contador.join();
        // contador2.join();
        // contador3.join();
        // } catch (InterruptedException e) {
        // System.err.println("Main thread was interrupted.");
        // }
        // System.out.println("Threads started. Check the output for their execution.");
        try {
            contador.join();
            contador2.join();
            contador3.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread was interrupted.");
        }
        while (!contador.isAlive()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Main thread was interrupted.");
            }
        }
    }
}
