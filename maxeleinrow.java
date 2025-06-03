import java.util.Scanner;
public class maxeleinrow {
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
        for(int i = 0 ; i < n ; i++){
            int maxele = 0;
            for(int j = 0 ; j < m ; j++){
                maxele = Math.max(maxele, arr[i][j]);
            }
            System.out.println("max element in row "+(i+1)+" is "+maxele);
        }
    }
}
