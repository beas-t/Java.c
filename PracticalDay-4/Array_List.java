import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(0, 10);
        arrayList.add(1, 20);
        arrayList.add(2, 30);

        int indexToRemove = 1;
        int removedElement = arrayList.remove(indexToRemove);
        System.out.println("Removed element from ArrayList: " + removedElement);
    }
}

