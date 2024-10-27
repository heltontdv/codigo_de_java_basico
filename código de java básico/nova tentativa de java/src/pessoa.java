//não deu certo

public class pessoa {
    // Atributos
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);
        // Chamando o método mostrarInfo
        pessoa1.mostrarInfo();
    }
}
