abstract class Animal{
    abstract void som();

    void dormir(){
        System.out.println("o animal está dormindo");
    }
}

class gato extends Animal {
    void som(){
        System.out.println("o gato mia");
    }
}

public class TesClasseAbstrata {
    public static void main(String[] args) {
        gato meuGato = new gato();
        meuGato.som();
        meuGato.dormir();
    }
}
