import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManipulacaoData {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual: " + hoje);

        LocalDate dataFutura = hoje.plusDays(10);
        System.out.println("Data futura (10 dias depois): " + dataFutura);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String dataFormatada = dataFutura.format(formatter);
        System.out.println("Data futura formatada: " + dataFormatada);
    }
}