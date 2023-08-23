import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

class CollectionFactory {
    private static CollectionFactory instance;

    private CollectionFactory(){}

    public static CollectionFactory getInstance() {
        if (instance == null) {
            instance = new CollectionFactory();
        }
        return instance;
    }

    
    public <T> Collection<T> createOrderedInsertionCollection() {
        return new ArrayList<>();
    }

    public <T> Collection<T> createUnorderedCollection() {
        return new HashSet<>();
    }

    public <T extends Comparable<T>> Collection<T> createOrderedNaturalSortingCollection() {
        return new TreeSet<>();
    }
}

public class Colecao {
    public static void main(String[] args) {
        CollectionFactory factory = CollectionFactory.getInstance();

        
        Collection<String>  ordenada = factory.createOrderedInsertionCollection();
        Collection<Integer> desordenada = factory.createUnorderedCollection();
        Collection<Double> colecaoNatural = factory.createOrderedNaturalSortingCollection();

        
        ordenada.add("Banana");
        ordenada.add("Laranja");
        ordenada.add("Maçã");

        desordenada.add(10);
        desordenada.add(30);
        desordenada.add(20);

        colecaoNatural.add(3.14);
        colecaoNatural.add(1.23);
        colecaoNatural.add(2.71);

        
        System.out.println("Coleção de Inserção Ordenada: " + ordenada);
        System.out.println("Coleção desordenada: " + desordenada);
        System.out.println("Coleção de classificação natural encomendada: " + colecaoNatural);
    }
}
