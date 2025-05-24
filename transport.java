import java.util.Scanner;

public class transport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int busCount = 1;
        int currentLoad = 0;

        for (int i = 0; i < n; i++) {
            if (currentLoad + a[i] <= m) {
                currentLoad += a[i];
            } else {
                busCount++;
                currentLoad = a[i];
            }
        }

        System.out.println(busCount);

        sc.close();
    }
}
