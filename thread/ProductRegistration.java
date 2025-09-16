package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProductRegistration {

    private static List<String> productTable = new CopyOnWriteArrayList<>();
    private static BlockingQueue<String> productsQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        List<String> products = List.of("Produto A", "Produto B", "Produto C", "Produto D", "Produto E", "Produto F");
        productsQueue.addAll(products);

        int numThreads = 3;

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new RegistrationTask());
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                System.out.println("Deu erro no join " + e.getMessage());
            }
        }

        System.out.println("Produtos cadastrados com sucesso");

        for (String product : productTable) {
            System.out.println(product);
        }
    }

    static class RegistrationTask implements Runnable {

        @Override
        public void run() {
            String product;

            while ((product = productsQueue.poll()) != null) {
                System.out
                        .println("Cadastrando produto " + product + " ( Thread ) " + Thread.currentThread().getName()
                                + ")");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Erro ao salvar produto");
                }
                productTable.add(product);
            }
        }
    }
}
