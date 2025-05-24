import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of test cases: ");
        int t = sc.nextInt();
        
        for (int testCase = 0; testCase < t; testCase++) {
            long num = sc.nextLong();
            
            int one = 0;
            int zero = 0;

            while (num > 0) {
                int digit = (int)(num % 10);
                if (digit == 1) {
                    one++;
                } else if (digit == 0) {
                    zero++;
                }
                num = num / 10;
            }

            for (int i = 0; i < one; i++) {
                System.out.print("1");
            }
            
            for (int i = 0; i < zero; i++) {
                System.out.print("0");
            }
            
            System.out.println();
        }

        sc.close();
    }
}
