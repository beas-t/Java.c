import java.util.LinkedList;
import java.util.List;
class sample{
    public static void main(String[] args) {
        List<String> L=new LinkedList<String>();
        L.add("ABC");
        L.add("DEF");
        L.add("GHI");
        L.remove("GHI");
        System.out.println(L);
    }
}