import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int num = sc.nextInt();
        System.out.println("enter the 2nd number: ");
        int m = sc.nextInt();
        int l=(num/m)*m;
        int u=((num+m-1)/m)*m;
        System.out.println("lower value: "+l);
        System.out.println("higher value: "+u);
        int dis1 = num - l;
        int dis2 = u - num;
        if(dis1==dis2){
            System.out.println("nearest value: "+u);
        }
        else if(dis1>dis2){
            System.out.println("nearest value: "+u);
        }
        else{
            System.out.println("nearest value: "+l);
        }
    }
}