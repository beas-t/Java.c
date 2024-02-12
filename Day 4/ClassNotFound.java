public class ClassNotFound {
    public static void main(String[] args) {
        try {
            Class.forName("Aadithya");
        } catch (ClassNotFoundException e) {
            System.out.println("An error occurred.\n"+e);
        }
    }
}

