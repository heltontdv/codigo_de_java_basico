
// Outra forma de fazer
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class  stream {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            numeros.add(i);
        }

        List<Integer> numerosPares = numeros.stream()
      .filter(num -> num % 2 == 0)
      .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);                 
    }
}