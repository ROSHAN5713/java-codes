import java.util.Scanner;

public class strcycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encrypted text: ");
        String str1 = scanner.nextLine();
        int j = str1.length();
        String str2 = scanner.nextLine();
        int k = str2.length();
        int count = 0;
        for(int i = 0 ; i < k ; i++){
            char ch1 = str2.charAt(i);
            for(int m = 0 ; m < j ; m++){
                char ch2 = str1.charAt(m);
                if(ch1 != ch2){
                    break;
                }
                else if(ch1 == ch2){
                    count++;
                }
            }
        }
        if (count == (j*k)) {
                System.out.println("it is in cycle");
            }
            else{
                System.out.println("it is not in cycle");
            }

    }
}