
import java.util.HashMap;
import java.util.Map;

public class HashTable {
    private Map<Integer, Map<String, String>> table;

    public HashTable() {
        table = new HashMap<>();
    }
    private int hash(String key) {
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
            hashValue += key.charAt(i);
        }
        return hashValue;
    }
    public void add(String key, String value) {
        int hashKey = hash(key);
        table.computeIfAbsent(hashKey, k -> new HashMap<>()).put(key, value);
        System.out.println("Added: " + key + " - " + value);
    }
    public String get(String key) {
        int hashKey = hash(key);
        if (table.containsKey(hashKey)) {
            Map<String, String> innerMap = table.get(hashKey);
            if (innerMap.containsKey(key)) {
                return innerMap.get(key);
            }
        }
        System.out.println("Not found: " + key);
        return null;
    }
}
