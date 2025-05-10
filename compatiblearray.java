import java.util.Scanner;

public class compatiblearray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[]= new int[n]; 
        int count=0;
        System.out.print("enter elements of 1st array: ");
        for(int i = 0; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("enter elements of 2nd array: ");
        for(int i = 0; i < n ; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n ; i++){
            if(arr1[i]>=arr2[i]){
                count++;
            }
        }
        if(count == n){
            System.out.println("Compatible");
        }
        else{
            System.out.println("Not Compatible");
        }
    }
}