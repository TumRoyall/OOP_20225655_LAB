

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args){
        int N; 
        System.out.println("Nhap so N cua mang: ");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[] arr = new int[N];
        int sum = 0;

        for( int i = 0; i < N; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            int temp = scanner.nextInt();
            int tmp2 = 0;
            sum += temp;
            for(int j = 0; j < i; j++){
                if(temp < arr[j]){
                    tmp2 = 1;
                    for(int k = i; k > j; k--){
                        arr[k] = arr[k-1];
                    }
                    arr[j] = temp;
                    break;
                }
            }
            if(tmp2 == 0){
                arr[i] = temp;
            }
        }
        System.out.println("Day sau khi sort: ");
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + (double)sum/N);
        scanner.close();
    }
}
