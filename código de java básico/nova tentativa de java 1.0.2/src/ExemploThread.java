 class MinhaThread extends Thread {
    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
    }

    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(nome + " - contagem: " +i);
            try {
                Thread.sleep(1000);// pausa por 1 segundo
                // Thread.yield(); // alternativa ao sleep para dar mais efeito de concorrencia
                // se quiser voltar a executar outras threads, usar join()
                // Thread.sleep(1000).join(); // alternativa ao yield para dar mais efeito de concorrencia
            }catch (InterruptedException e){
                System.out.println(e);

                // Se a thread for interrompida, podemos fazer algo como reiniciar
                // Thread.currentThread().interrupt();
                // continue; // ou voltar a executar outras threads
                // throw new RuntimeException(e); // ou lançar uma exceção
                // e.printStackTrace(); // para imprimir a stack trace do erro
                // System.exit(1); // para encerrar a aplicação
                // System.out.println("Thread interrompida");
                // return; // ou voltar a executar outras threads
                // throw new RuntimeException("Thread interrompida"); // ou lançar uma exceção
                // e.printStackTrace(); // para imprimir a stack trace do erro
                // System.exit(1); // para encerrar a aplicação
                // System.out.println("Thread interrompida");
                // return; // ou voltar a executar outras threads
                // throw new RuntimeException("Thread interrompida"); // ou lançar uma exceção
                // e.printStackTrace(); // para imprimir a stack trace do erro
                // System.exit(1); // para encerrar a aplicação
                // System.out.println("Thread interrompida");
                // return; // ou voltar a executar outras threads
            }
        }
    }
}

public class ExemploThread{
    public static void main(String[] args) {
        MinhaThread t1 = new MinhaThread("Thread 1");
        MinhaThread t2 = new MinhaThread("Thread 2");

        t1.start();
        t2.start();
    }
}
