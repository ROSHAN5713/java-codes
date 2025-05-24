import java.util.*;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of persons: ");
        int n = sc.nextInt();

        int array[] = new int[n * 2]; // Assuming height and weight for each person
        int max_h = 0;
        int max_w = 0;
        int max_h_i = 0;
        int max_w_i = 0;

        System.out.println("Enter height and weight for each person:");

        for (int i = 0; i < n * 2; i++) {
            array[i] = sc.nextInt();
        }

        // Iterate through height and weight separately
        for (int i = 0; i < n * 2; i += 2) {
            if (array[i] > max_h) {
                max_h = array[i];
                max_h_i = i;
            }
            if (array[i + 1] > max_w) {
                max_w = array[i + 1];
                max_w_i = i + 1;
            }
        }

        System.out.println("Maximum height: " + max_h);
        System.out.println("Maximum weight: " + max_w);
        System.out.println("Person with maximum height: " + ((max_h_i / 2) + 1));
        System.out.println("Person with maximum weight: " + ((max_w_i / 2) + 1));
    }
}