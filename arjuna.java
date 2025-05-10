import java.util.Scanner;

public class arjuna{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements of array: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the index no : ");
        int pos = sc.nextInt();
        if(pos > n){
            System.out.println("index out of bound");
        }
        else{
            System.out.print("enter the element: ");
            int e = sc.nextInt();
            System.out.print("array after insertion: ");
            for(int i = 0; i < n ; i++){
                if(i == pos-1){
                    System.out.print(e+" ");
                    //arr[i]=e;
                }
                System.out.print(arr[i]+" ");
            }
        }
    }
}