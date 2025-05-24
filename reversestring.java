import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String reversed = reverse(str);
        System.out.println("Reversed String: " + reversed);
    }
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
            
}
