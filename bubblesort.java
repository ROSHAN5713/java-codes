import java.util.Scanner;
public class bubblesort{
    public static void bubble (int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j] > key){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println();
        System.out.print("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}