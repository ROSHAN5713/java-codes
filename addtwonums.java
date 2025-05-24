import java.util.Scanner;

public class addtwonums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range of 1st array: ");
        int n = sc.nextInt();
        System.out.print("enter range of 2nd array: ");
        int m = sc.nextInt();
        int arr1[]= new int[n];
        int arr2[]= new int[m];
        int t1=0;
        int t2=0;
        int sum=0;
        for(int i = n-1 ; i >= 0 ; i--){
            arr1[i] = sc.nextInt();
        }
        for(int j = m-1 ; j >= 0 ; j--){
            arr2[j] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr1[i]);
        }
        System.out.print(" + ");
        for(int j = 0 ; j < m ; j++){
            System.out.print(arr2[j]);
        }
        System.out.println(" = ");
        for(int i = 0;i<n;i++){
            arr1[i]=t1+arr1[i];
            t1 = t1*10;
        
            for(int j = 0;j<m;j++){
                arr2[j]=t2+arr2[j];
                t2 = t2*10;
            }
        }
        sum = t1+t2;
        System.out.print(sum);
    }
}