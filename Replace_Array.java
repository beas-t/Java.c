public class Replace_Array {
    public static void main(String[] args) {
        int i, j;

        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);
                if (a[1][1] == 5) {
                    a[1][1] = 0;

                    System.out.println(a[1][1]);
                }
            }
        }
    }
}


