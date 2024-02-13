import java.util.Set;
import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args)
    {
        Set<String> L=new TreeSet<String>();
        L.add("ABC");
        L.add("DEF");
        L.add("GHI");
        System.out.println(L);
        L.remove("DEF");
        System.out.println(L);

    }
}
