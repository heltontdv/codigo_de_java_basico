public class manipulacaostrinds {
    // O código acima não possui um corpo principal, logo ele não será compilado.
    // Para executar esse programa, compile-o usando o comando "javac manipulacaostrinds.java" e execute-o usando o comando "java manipulacaostrinds".
    
    // Este programa não possui interface gráfica, mas você pode testá-lo em um ambiente Java.
    
    // Funções do Java para manipulação de strings:
    // length(): retorna o comprimento da string
    // charAt(int index): retorna o caractere na posição especificada
    // toUpperCase(): converte a string para maiúsculas
    // toLowerCase(): converte a string para minúsculas
    // substring(int inicio, int fim): retorna uma nova string contendo os caracteres da original, começando na posição especificada pelo índice inicial e terminando na posição especificada pelo índice final (exclusive)
    // Exemplos de uso:
    // frase.length() => 16
    // frase.charAt(5) => 'j'
    // frase.toUpperCase() => "JAVA É INCRIVEL"
    // frase.toLowerCase() => "java é incrivel"
    // frase.substring(5, 14) => "java é inci"
    // O método substring não altera a string original, ele apenas retorna uma nova string.
    // Para testar esse programa, você pode usar o método main() como demonstrado abaixo:
    
    public static void main(String[] args) {
        String frase = "java é incrivel";

        // Mostrando o comprimento, o caractere na posição 5, a frase em maiúsculas, a frase em minúsculas, e a subfrase
        
        System.out.println("comprimento da frase: " + frase.length());
        System.out.println("caractere na posição 5: " + frase.charAt(5));
        System.out.println("frase em maiúsculas: " + frase.toUpperCase());
        System.out.println("frase em minúsculas " + frase.toLowerCase());
        System.out.println("subfrase: " + frase.substring(5, 14));
    }
}
