import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class CollectionFactory<T> {
    public Collection<T> criaCollection(int tamanho, boolean isOrdenado, boolean podeRepetir)    {
        if (tamanho>0) {
            return new ArrayList<>(tamanho);
        }
        if (podeRepetir) {
            return new LinkedList<>();
        }
        if (isOrdenado) {
            return new TreeSet<>();
        }
        return new HashSet<>();
    }
}