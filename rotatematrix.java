import java.util.Scanner;
public class rotatematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("enter the number of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" ");
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = m-1 ; j >= 0 ; j--){
                System.out.print(arr[j][n-i-1]+" ");
            }
            System.out.println();
        }
    }
}
