public class arrays {

    // método principal do programa
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
         
        // imprimindo os elementos do array usando um laço for
        // iniciando o índice i em 0
        // enquanto i for menor que o comprimento do array
        // incrementa o índice i em 1
        // imprime o elemento na posição i do array
        // e avança para a próxima posição do array
        // o laço termina quando i for igual ao comprimento do array (5)
        System.out.println("elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}