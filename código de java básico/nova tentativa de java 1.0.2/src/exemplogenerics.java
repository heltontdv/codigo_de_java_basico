

// Adicione o código da classe caixa aqui

// Adicione o código da classe Animal aqui


class caixa<T>{
    private T conteudo;
    public void adicionar(T conteudo){
        this.conteudo = conteudo;
    }

    public T obter(){
        return conteudo;
    }
}

public class exemplogenerics {
    public static void main(String[] args) {
        caixa<String> caixaDeTexto = new caixa<>();
        caixaDeTexto.adicionar("Olá, Mundo!");
        System.out.println("Conteúdo da caixa: " + caixaDeTexto.obter());

        caixa<Integer> caixaDeNumero = new caixa<>();
        caixaDeNumero.adicionar(123);
        System.out.println("conteúdo da caixa: " + caixaDeNumero.obter());
    }
}
    

