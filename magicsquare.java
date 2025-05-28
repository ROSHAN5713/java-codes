import java.util.Scanner;
public class magicsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("enter the number of columns: ");
        int m = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i == j){
                    sum1 += arr[i][j];
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i + j == n - 1){
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("sum1: "+sum1);
        System.out.println("sum2: "+sum2);
        if(sum1 == sum2){
            System.out.println("it is magic square");
        }
        else{
            System.out.println("it is not magic square");
        }
    }
}
