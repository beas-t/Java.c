import java.util.*;

public class Hash_Map{
    public static void main(String[] args) {

        Map<String, String> super1 = new HashMap<>();
        super1.put("Apple", "A");
        super1.put("Banana", "B");
        super1.put("Carrot", "C");
        super1.put("Broccoli", "B");

        super1.entrySet().removeIf(entry -> entry.getKey().startsWith("B"));
        System.out.println("HashMap super1 after removing keys starting with 'B': " + super1);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 5);
        hashMap.put("C", 7);
        hashMap.put("D", 3);
        hashMap.put("E", 6);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value * 10: " + (entry.getValue() * 10));
        }

        System.out.println("Entries of HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        hashMap.computeIfAbsent("C", k -> 4);
        System.out.println("HashMap after computing value for key 'C': " + hashMap);
}
}