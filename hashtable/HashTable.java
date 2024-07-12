package hashtable;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class HashTable<K, V> {

    private ValuePair<K, V>[] table;

    public HashTable() {
        this.table = new ValuePair[1000];
    }

    public void push(K key, V value) {
        if (key != null && value != null) {
            int position = this.hash(key);
            table[position] = new ValuePair<>(key, value);
        }
    }

    public V get(K key) {
        if(key == null) throw new IllegalArgumentException();

        int position = this.hash(key);
        return table[position] != null ? table[position].getValue() : null;
    }

    //Função hash com alta taxa de colisão
    private int loseLoseHashCode(K key) {
        String str = key.toString();

        int hash = 0;

        for (char c : str.toCharArray()) {
            hash += c;
        }

        return hash % 37;
    }

    private int hash(K key) {
        return this.loseLoseHashCode(key);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(table).filter(i -> i != null).toArray());
    }

}