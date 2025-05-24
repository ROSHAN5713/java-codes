import java.util.Scanner;

public class addtwonums2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of 1st array: ");
        int n = sc.nextInt();
        System.out.print("Enter range of 2nd array: ");
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        
        System.out.print("Enter elements of 1st array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter elements of 2nd array: ");
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        
        int r1 = 0, r2 = 0;
        for (int i = 0; i < n; i++) {
            r1 = r1 * 10 + arr1[i];
        }
        for (int j = 0; j < m; j++) {
            r2 = r2 * 10 + arr2[j];
        }
        
        int sum = r1 + r2;
        
        System.out.println("1st array as number: " + r1);
        System.out.println("2nd array as number: " + r2);
        System.out.println("Sum of both arrays: " + sum);
        
        int temp = sum;
        int num = 0;
        while (temp > 0) {
            num++;
            temp /= 10;
        }
        
        int[] arr3 = new int[num];
        temp = sum;
        for (int i = num - 1; i >= 0; i--) {
            arr3[i] = temp % 10;
            temp /= 10;
        }
        System.out.print("Result : ");
        for (int i = 0; i < num; i++) {
            System.out.print(arr3[i] + " ");
        }
        
    }
}
