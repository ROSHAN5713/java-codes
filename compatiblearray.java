import java.util.Scanner;

public class compatiblearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of 1st array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter " + n + " elements for 1st array:");
        int i,j;
        for (i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter range of 2nd array: ");
        int m = sc.nextInt();
        int arr2[]= new int[m];
        System.out.println("Enter " + m + " elements for 2nd array:");
        for (j = 0; j< m; j++){
            arr2[j] = sc.nextInt();
        }
        if(i == j && arr1[i] >= arr2[j]){
            System.out.println("Array 1 is compatible with Array 2");
        }
        else{
            System.out.println("Array 1 is not compatible with Array 2");
        }
    }
}