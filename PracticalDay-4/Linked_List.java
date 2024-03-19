import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter integers (enter -1 to stop):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            linkedList.add(input);
        }

        System.out.println("Original linked list: " + linkedList);

        Collections.reverse(linkedList);

        System.out.println("Reversed linked list: " + linkedList);
    }
}