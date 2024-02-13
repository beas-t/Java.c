import java.util.SortedSet;
import java.util.TreeSet;
public class Sortedset {
    public static void main(String[] args)
    {
        SortedSet<String> M = new TreeSet<String>();
        M.add("ABC");
        M.add("DEF");
        M.add("GHI");
        System.out.println(M);
        M.remove("DEF");
        System.out.println(M);

        SortedSet<Integer> L = new TreeSet<Integer>();
        L.add(123);
        L.add(456);
        L.add(789);
        System.out.println(L);
        L.remove(123);
        System.out.println(L);

    }
}
