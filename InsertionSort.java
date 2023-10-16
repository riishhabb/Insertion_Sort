import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n = a.length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integers: ");

        for (int b = 0; b < n; b++) {
            a[b] = scan.nextInt();
        }

        for (int j = 1; j < n; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }

        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");  // Added space to separate numbers
        }
    }
}
