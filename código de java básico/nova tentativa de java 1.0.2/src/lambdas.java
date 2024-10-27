
// Comentário de uma linha

// Comentário de múltiplas linhas

// Importando a biblioteca ArrayList para usar ArrayList

// Declarando uma lista de strings chamada nomes

// Utilizando o forEach para iterar sobre cada elemento da lista e imprimir o nome na tela


// Aqui está um exemplo de uso de lambda expressions com forEach para imprimir os nomes na tela.

import java.util.ArrayList;


// Classe principal com método main

    // Declarando uma lista de strings chamada nomes

    // Adicionando nomes à lista

    // Utilizando forEach para iterar sobre cada elemento da lista e imprimir o nome na tela

    // Aqui está um exemplo de uso de lambda expressions com forEach para imprimir os nomes na tela.

    // O lambda expression é uma função anônima que não possui um nome e pode ser atribuído a uma variável ou passado como um argumento para outras funções.

    // (nome) -> System.out.println(nome) é o lambda expression que imprime o nome na tela.

    // A função forEach é uma interface que define um método chamado forEach que recebe um Consumer como argumento e executa esse consumer para cada elemento da coleção.

    // O Consumer é uma interface funcional que possui um método accept que recebe um argumento do tipo T e não retorna nada.

    // O lambda expression (nome) -> System.out.println(nome) é um Consumer que imprime o nome na tela.

// Classe principal com método main
public class lambdas {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("David");
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Charlie");

        nomes.forEach((nome) -> System.out.println(nome));
    }    
}
