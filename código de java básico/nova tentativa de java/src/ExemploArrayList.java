
// Exemplo de ArrayList em Java

// Importando a classe ArrayList do pacote java.util

// Criando uma ArrayList de Strings chamada lista e adicionando três frutas à ela.

// Imprimindo a lista de frutas usando um for-each loop.

// Remover a fruta "banana" da lista e imprimindo a lista de frutas novamente.

// O ArrayList é uma lista dinâmica, pode adicionar ou remover elementos sem alterar a sua posição.


// O ArrayList não possui um índice fixo, ele pode ser facilmente alterado sem perder a ordem dos elementos.

// O ArrayList é mais eficiente para adicionar ou remover elementos do início da lista, já que ele mantém os elementos em um array.

// O ArrayList é uma das estruturas mais comuns em Java, é usada para armazenar dados e manipular dados em listas.

// Para mais informações sobre ArrayList, veja: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

import java.util.ArrayList;

public class ExemploArrayList{

    // Método principal do programa

    // Cria uma ArrayList de Strings chamada lista e adiciona três frutas à ela.

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("maçã");
        lista.add("banana");
        lista.add("laranja");

        System.out.println("Lista de frutas:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        lista.remove("banana");
        System.out.println("Lista de fruta após remoção:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }

    }
}