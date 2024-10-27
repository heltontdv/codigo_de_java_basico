import java.util.Scanner;


public class estruturacondicionalswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler um número de 1 a 5 do tecledo
        // usar o switch para verificar qual caso corresponde ao número lido
        // imprimir a mensagem correspondente ao caso escolhido
        // caso não seja um número de 1 a 5, imprimir a mensagem "numero invalido"
        // usar o break para sair do switch após imprimir a mensagem correspondente ao caso escolhido
        
        System.out.println("digite um número de 1 a 5: ");
        int numero = sc.nextInt();

        // usando o switch com break
        // imprimir a mensagem correspondente ao caso escolhido após cada caso
        // caso o número não seja entre 1 e 5, imprimir a mensagem "numero invalido"
        // usando o default para caso o número não seja nenhum dos casos acima

        // usando o switch sem break
        // imprimir a mensagem correspondente ao caso escolhido
        // caso o número não seja entre 1 e 5, imprimir a mensagem "numero invalido"
        // usando o default para caso o número não seja nenhum dos casos acima
        
        // usando o switch com break
        // imprimir a mensagem correspondente ao caso escolhido após cada caso
        // caso o número não seja entre 1 e 5, imprimir a mensagem "numero invalido"
        // usando o default para caso o número não seja nenhum dos casos acima
        switch (numero) {
            case 1:
            System.out.println("você digitou um.");
            break;
            case 2:
            System.out.println("você digitou dois.");
            break;
            case 3:
            System.out.println("você digitou três.");
            break;
            case 4:
            System.out.println("você digitou quatro.");
            break;
            case 5:
            System.out.println("você digitou cinco.");
            break;
            default:
            System.out.println("número inválido.");
            break;
        }
        sc.close();
    }
}
