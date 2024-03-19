import java.util.*;

public class Create_Tree {
    public static void main(String[] args) {

        TreeSet<Integer> arr1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        TreeSet<Integer> arr2 = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("Set 1: " + arr1);
        System.out.println("Set 2: " + arr2);

        TreeSet<Integer> difference = new TreeSet<>(arr1);
        difference.removeAll(arr2);
        System.out.println("Difference between sets: " + difference);

        int threshold = 3;
        System.out.println("Smallest element greater than " + threshold + ": " + arr1.higher(threshold));

        System.out.println("First element: " + arr1.pollFirst());
        System.out.println("Last element: " + arr1.pollLast());
        System.out.println("Remaining elements: " + arr1);

        int specificElement = 4;
        System.out.println("Floor value of " + specificElement + ": " + arr1.floor(specificElement));
        System.out.println("Ceiling value of " + specificElement + ": " + arr1.ceiling(specificElement));
    }
}

