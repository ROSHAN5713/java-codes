import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        
        System.out.println("Enter the elements (sorted row-wise): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        
        int low = 0, high = n * m - 1;
        boolean found = false;
        int row = -1, col = -1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int r = mid / m;
            int c = mid % m;
            
            if (arr[r][c] == target) {
                found = true;
                row = r;
                col = c;
                break;
            } else if (arr[r][c] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        if (found) {
            System.out.println("Element found at position (" + row + ", " + col + ")");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }
}
