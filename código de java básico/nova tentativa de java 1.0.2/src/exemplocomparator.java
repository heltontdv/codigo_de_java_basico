import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Classe que representa uma pessoa

// Classe principal com método main

    // Declarando uma lista de pessoas chamada pessoas

    // Adicionando pessoas à lista
    //...
    //...

    // Ordenar por idade
    // Collections.sort(pessoas, new Comparator<pessoa>(){
    //     public int compare(pessoa p1, pessoa p2) {
    //         return Integer.compare(p1.idade, p2.idade);
    //     }
    // });

    // Mostrar os nomes e idades das pessoas ordenadas por idade
    //...
    //...


    // Aqui está um exemplo de uso de lambda expressions com forEach para imprimir os nomes na tela.

class pessoa {
    String nome;
    int idade;
    
    pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return nome + "-" + idade + "anos";
    }
}

public class exemplocomparator {
    public static void main(String[] args) {
        ArrayList<pessoa> pessoas = new ArrayList<>();
        pessoas.add(new pessoa("Alice", 30));
        pessoas.add(new pessoa("Bob", 25));
        pessoas.add(new pessoa("Charlie", 35));

        // Mostrar os nomes e idades das pessoas

        // ordenar por idade
        Collections.sort(pessoas, new Comparator<pessoa>(){
            public int compare(pessoa p1, pessoa p2) {
                return Integer.compare(p1.idade, p2.idade);
            }

            // Usando lambda expressions
            // pessoas.forEach(pessoa -> System.out.println(pessoa));

            // Usando método anônimo
            // pessoas.forEach(new Consumer<pessoa>() {
            //     @Override
            //     public void accept(pessoa pessoa) {
            //         System.out.println(pessoa);
            //     }
            // });
        });

        System.out.println("Pessoa ordenadas por idade");
        for (pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}