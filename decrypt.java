import java.util.Scanner;

public class decrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encrypted text: ");
        String str = scanner.nextLine();
        int j = str.length();
        if( j % 2 == 0){
        for (int i = 0; i < j; i++){
            char f = str.charAt(i);
            char s1 = str.charAt(i + 1);
            i++;
            String s = String.valueOf(s1+""+f);
            System.out.print(s);
            }
        }
        else{
        for (int i = 0; i < j-1; i++){
            char f = str.charAt(i);
            char s1 = str.charAt(i + 1);
            i++;
            String s = String.valueOf(s1+""+f);
            System.out.print(s);
            }
            System.out.print(str.charAt(j-1));
        }
    }
}