import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        treeMap.put("D", 4);
        treeMap.put("E", 5);

        System.out.println("Original TreeMap: " + treeMap);
        System.out.println("First entry: " + treeMap.pollFirstEntry());
        System.out.println("n-1 entries: " + treeMap.descendingMap().pollFirstEntry());

        TreeMap<String, Integer> emptyTreeMap = new TreeMap<>();
        System.out.println("Empty TreeMap sorted by natural order of keys: " + emptyTreeMap);

        SortedMap<String, Integer> subMap = treeMap.subMap("A", "D");
        System.out.println("SubMap from 'A' to 'D': " + subMap);

        SortedMap<String, Integer> headMap = treeMap.headMap("C");
        System.out.println("Portion of the map whose keys are strictly less than 'C': " + headMap);
        SortedMap<String, Integer> tailMap = treeMap.tailMap("C");
        System.out.println("Portion of the map whose keys are greater than or equal to 'C': " + tailMap);
}
}