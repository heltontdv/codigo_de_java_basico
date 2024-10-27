enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

// Traduzindo os valores do enum para o português

// O enum DiaDaSemana possui os valores SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO e DOMINGO

// Ao imprimir "Hoje é segunda-feira", por exemplo, o programa irá mostrar "Hoje é segunda-feira" na tela, traduzindo o valor do enum para o português.

public class exemploenum {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

        // Traduzindo o enum para o português

        switch (hoje) {
            case SEGUNDA:
                System.out.println("Hoje é segunda-feira");
                break;
            case TERCA:
                System.out.println("Hoje é terça-feira");
                break;
            case QUARTA:
                System.out.println("Hoje é quarta-feira");
                break;
            case QUINTA:
                System.out.println("Hoje é quinta-feira");
                break;
            case SEXTA:
                System.out.println("Hoje é sexta-feira");
                break;
            case SABADO:
                System.out.println("Hoje é sábado");
                break;
            case DOMINGO:
                System.out.println("Hoje é domingo");
                break;
            default:
                System.out.println("Dia da semana inválido");
                break;
        }
    }
}
