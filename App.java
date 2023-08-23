import java.util.Collection;

public class App {
    public static void main(String[] args) {
        CollectionFactory colecoes = new CollectionFactory<>();

        Collection<Integer> c = colecoes.criaCollection(0, false, false);

        c.add(10);
        c.add(40);
        c.add(10);
        c.forEach(System.out::println);
    }
}
