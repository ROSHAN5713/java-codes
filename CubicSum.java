import java.util.Scanner;

public class CubicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range:");
        int n = sc.nextInt();
        int[] numbers = new int [n];
        int count = 0;
        
        for(int i = 0; i<n; i++){
            numbers[i]=sc.nextInt();
        }

        for (int num : numbers) {
            if (isGoodNumber(num)){
                count++;
            }
        }

        System.out.println("Count of good numbers: " + count);
    }

    public static boolean isGoodNumber(int z) {
        for (int x = 1; x * x * x <= z; x++) {
            for (int y = 1; y * y * y <= z; y++) {
                if (x * x * x + y * y * y == z) {
                    return true;
                }
            }
        }
        return false;
    }
}