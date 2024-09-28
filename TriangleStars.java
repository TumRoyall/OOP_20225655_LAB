import java.util.Scanner;
public class TriangleStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int rows = scanner.nextInt(); 

        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close(); 
    }
}
