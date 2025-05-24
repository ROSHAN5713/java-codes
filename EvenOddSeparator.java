import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSeparator {

    public static void separateEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        separateEvenOdd(arr);
        System.out.println("Separated Array: " + Arrays.toString(arr));
        scanner.close();
    }
}
