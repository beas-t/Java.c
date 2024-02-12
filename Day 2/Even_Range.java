import java.util.Scanner;
public class Even_Range {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter num:");
        int i = n.nextInt();
        for (int j = 0; j<= 10; j++){
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        for(int j=0;j<=i;j++){
            int k=i/2;
            System.out.println("\nThe middle element:"+k);
            break;


            }

        }
    }


