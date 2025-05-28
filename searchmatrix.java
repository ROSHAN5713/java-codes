import java.util.Scanner;
public class searchmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("enter the number of columns: ");
        int m = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[][] arr = new int[n][m];
        int k = 0;
        int l = 0;
        int a = 0;
        int b = 0;
        int temp = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("enter the target : ");
        int target = sc.nextInt();
        for(k = 0 ; k < n ; k++){
            for(l = 0 ; l < m ; l++){
                if(arr[k][l] == target){
                    temp = 1;
                    a = k;
                    b = l;
                }
            }
        }
        if(temp == 1){
                    System.out.println("Element found at position ("+(a)+","+(b)+")");
                }
                else{
                    System.out.println("Element not found at any position");
                }
    }
}