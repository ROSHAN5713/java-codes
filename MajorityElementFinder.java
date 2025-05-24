import java.util.Scanner;

public class MajorityElementFinder {

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of 1st array: ");
        int n = sc.nextInt();
        System.out.print("enter the range of 2nd array: ");
        int m = sc.nextInt();

        int[] nums1 = new int [n];
        System.out.print("enter the elements of 1st array: ");
        for(int i = 0 ; i < n ; i++){
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int [m];
        System.out.print("enter the elements of 2nd array: ");
        for(int j = 0 ; j < m ; j++){
            nums2[j] = sc.nextInt();
        }

        System.out.println("Majority Element in nums1: " + majorityElement(nums1));
        System.out.println("Majority Element in nums2: " + majorityElement(nums2));
    }
}
