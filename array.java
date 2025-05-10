import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index = (n-1);
        int i;
        int j;
        for(i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
            if (i%2==0) {
                System.out.println(arr[i]+" ");
                
            }
        }
        
    }
}