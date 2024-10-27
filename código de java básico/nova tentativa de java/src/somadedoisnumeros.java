import java.util.Scanner;

// Nome: somadedoisnumeros.java


public class somadedoisnumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler dois numeros do usuario e armazena-os nas variaveis num1 e num2
        // Imprime na tela a frase "digite o primeiro numero: "
        // Lê um numero do usuario e armazena na variavel num1
        // Imprime na tela a frase "digite o segundo numero: "
        // Lê um numero do usuario e armazena na variavel num2
        // Calcula a soma dos numeros e armazena na variavel soma
        // Imprime na tela a frase "a soma é: " seguido da soma dos numeros
        // Fecha o scanner

        // Ler dois numeros do usuario e armazena-os nas variaveis num1 e num2
        // Imprime na tela a frase "digite o primeiro numero: "
        // Lê um numero do usuario e armazena na variavel num1
        // Imprime na tela a frase "digite o segundo numero
        // Lê um numero do usuario e armazena na variavel num2
        // Calcula a soma dos numeros e armazena na variavel soma
        // Imprime na tela a frase "a soma é: " seguido da soma dos numeros
        // Fecha o scanner
        sc.close();
        System.out.println("digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("digite o segundo numero: ");
        int num2 = sc.nextInt();

        int soma = num1 - num2;
        //se trocar - ou + do de cima vai dar tudo certo
        System.out.println("a soma é: " + soma);

        sc.close();
    }
}
