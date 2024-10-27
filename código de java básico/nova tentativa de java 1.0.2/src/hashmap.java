import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Alice", 31);
        mapa.put("Bob", 28);
        mapa.put("Charlie", 35);

        System.out.println("Idade de Alice: " + mapa.get("Alice"));
        System.out.println("Idade de Charlie: " + mapa.get("Charlie"));
        System.out.println("Idade de Bob: " + mapa.get("Bob"));

        mapa.remove("Alice");
        System.out.println("Tamanho do mapa após remoção: " + mapa.size());
    }
}
