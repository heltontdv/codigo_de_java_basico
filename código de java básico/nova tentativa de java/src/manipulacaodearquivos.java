import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Programa para manipulação de arquivos

// Este programa cria um arquivo chamado "exemplo.txt" e escreve duas linhas nele.

// Para ler o arquivo, é necessário usar a classe BufferedReader e a FileReader.

// Para gravar em um arquivo, é necessário usar a classe FileWriter e o BufferedWriter.

// Neste programa, as exceções IOException são tratadas para evitar que o programa seja interrompido caso ocorra algum erro de I/O.

// Este programa não possui interface gráfica, mas você pode testá-lo em um ambiente Java.

// Para executar esse programa, compile-o usando o comando "javac manipulacaodearquivos.java" e execute-o usando o comando "java manipulacaodearquivos".

// Este programa não possui interface gráfica, mas você pode testá-lo em um ambiente Java.

public class manipulacaodearquivos {
public static void main(String[] args) {
    String caminhoArquivo = "exemplo.txt";

    // escrever em um arquivo

    try (FileWriter writer = new FileWriter(caminhoArquivo)) {
        writer.write("olá, mundo!/n");
        writer.write("java é incrivel!/n");
    } catch (IOException e){
        e.printStackTrace();
    }
    
    // ler de um arquivo
    
  
    try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
        String linha;
        while ((linha = reader.readLine()) != null){
            System.out.println(linha);
        }
    }catch (IOException e){
        e.printStackTrace();
    }
}
    }
    


