import java.util.LinkedHashMap;
import java.util.Map;

public class CacheLRU<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public CacheLRU(int capacity) {
        super(capacity + 1, 1.0f, true); // true para acesso ordenado
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public void put(K key, V value) {
        super.put(key, value);
    }

    public V get(K key) {
        return super.getOrDefault(key, null);
    }

    public void remove(K key) {
        super.remove(key);
    }

    public int size() {
        return super.size();
    }
}