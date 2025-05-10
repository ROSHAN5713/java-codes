public class ReverseTriangle2{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of rows:");
        //int r = sc.nextInt();
        int r = 5;
        for (int i = 1; i <= r; i++){
            for (int k = 1; k < i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= r - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}