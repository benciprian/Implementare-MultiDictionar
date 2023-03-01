import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultiDictionary<K, V> {
    private Map<K, ArrayList<V>> dictionary;

    public MultiDictionary() {
        dictionary = new HashMap<K, ArrayList<V>>();
    }

    public void put(K key, V value) {
        if (!dictionary.containsKey(key)) {
            dictionary.put(key, new ArrayList<V>());
        }
        dictionary.get(key).add(value);
    }

    public ArrayList<V> get(K key) {
        return dictionary.get(key);
    }
}
