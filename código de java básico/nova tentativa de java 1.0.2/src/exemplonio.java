import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class exemplonio {
    public static void main(String[] args) {
        Path caminhoArquivo = Paths.get("exemploNIO.txt");
        String conteudo = "Olá, mundo usando NIO!";

        try {
            //Escrever no arquivo
            Files.write(caminhoArquivo, conteudo.getBytes());
            System.out.println("Arquivo escrito com sucesso");

            //ler do arquivo
            String conteudoLido = new String(Files.readAllBytes(caminhoArquivo));
            System.out.println("Conteúdo lido do arquivo: " + conteudoLido);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}