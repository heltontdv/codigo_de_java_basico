
// interface veiculo

// interface veiculo define os métodos que um objeto da interface veiculo precisa ter.

// a interface veiculo é assinada sem corpo, apenas com os métodos sem implementação.

// a interface veiculo pode ter métodos com retorno, mas não podem ter construtores ou inicializadores.

interface veiculo{
    void acelerar();
    void frear();
}

// classe carro implementa a interface veiculo

// a classe carro precisa implementar todos os métodos da interface veiculo.

// a implementação dos métodos da interface veiculo é feita no corpo da classe.

// a interface veiculo pode ter outras interfaces como membros, mas elas não podem ter métodos com implementação.

// a implementação dos métodos da interface veiculo também pode ser feita em uma classe externa chamada implementadora.

// a interface veiculo pode também ter métodos default e static.

// métodos default são métodos que podem ser implementados na interface, mas não precisam ser implementados em cada classe que implementa a interface.

// métodos static são métodos que podem ser chamados sem instanciar a classe que implementa a interface.

// a interface veiculo também pode ter métodos estáticos.

// a interface veiculo também pode ter métodos abstratos.

// métodos abstratos são métodos que não podem ser implementados na interface, mas podem ser implementados na classe que implementa a interface.

// a interface veiculo também pode ter métodos de retorno.

// métodos de retorno são métodos que retornam um valor.

// a interface veiculo também pode ter métodos com argumentos.

// métodos com argumentos são métodos que recebem argumentos e podem ser chamados com argumentos diferentes.

// a interface veiculo também pode ter métodos com retorno e argumentos.

// a interface veiculo também pode ter métodos com retorno e argumentos com tipos genéricos.
class Carro implements veiculo{

    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

    public void frear(){
        System.out.println("O carro está freando");
    }
}

public class TesteInterface {
public static void main(String[] args) {
    Carro meuCarro = new Carro();

    meuCarro.acelerar();
    meuCarro.frear();

    
}
    
}
