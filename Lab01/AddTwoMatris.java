import java.util.Scanner;

public class AddTwoMatris {
    public static void main(String[] args){
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] result = new int[rows][cols];
        
        System.out.println("Enter the elements of the first matrix:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Enter element at row " + (i+1) + ", column " + (j+1) + ": ");
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Enter element at row " + (i+1) + ", column " + (j+1) + ": ");
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The resultant matrix is:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
