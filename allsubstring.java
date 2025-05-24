import java.util.Scanner;

public class allsubstring {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        System.out.println("All possible substrings are : ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
                count++;
            }
        }
        System.out.println("Total possible substrings are : " + count);
    }
}