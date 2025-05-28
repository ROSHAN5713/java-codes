import java.util.Scanner;
public class uppertringle {
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
        if(arr[1][0] == 0 && arr[2][0] == 0 && arr[2][1] == 0){
            System.out.println("it a lower triangle matrix");
        }
        else{
            System.out.println("it is not a lower triangle matrix");
        }
    }
    
}
