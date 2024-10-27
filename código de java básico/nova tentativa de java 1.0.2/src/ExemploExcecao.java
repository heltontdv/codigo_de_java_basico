public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);// Isso causará uma ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Índice do array fora dos limites!");
        }

        try {
            int resultado = dividir(10, 0);// Isso causará uma ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        }
        
    }

    public static int dividir(int a, int b) {
        return a / b; // Causa uma ArithmeticException se b for zero
    }
}