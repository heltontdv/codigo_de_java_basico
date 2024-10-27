import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exemplotrywithresources {
    public static void main(String[] args) {
        String caminhoArquivo = "exemplo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}