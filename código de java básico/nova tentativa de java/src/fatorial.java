import java.util.Scanner;

// Nome: fatorial.java
// programa que calcula o fatorial de um numero
// calcula o fatorial de um numero


public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        // Ler um numero do usuario e armazena na variavel num
        // Recebe um numero do usuario e armazena na variavel num

        // Imprime na tela a frase e o numero digitado pelo usuario
        // Imprime na tela a frase e o numero digitado pelo usuario

        // Calcula o fatorial do numero usando um loop
        // Calcula o fatorial do numero usando um loop

        // Mostra o resultado do fatorial no console
        // Mostra o resultado do fatorial no console

        System.out.println("digite um numero: ");
        int num = sc.nextInt();

        // Imprime na tela o resultado do fatorial

        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *=i;

        }

        // Imprime na tela o resultado do fatorial
        System.out.println("o fatorial de " + num + " é: " + fatorial);


        sc.close();
    }
}
