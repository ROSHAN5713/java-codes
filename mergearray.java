import java.util.Arrays;

public class mergearray {
    public static void mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int arr3[] = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged array: " + Arrays.toString(arr3));


        double median;
        int l = n + m;
        if (l % 2 == 0) {
            median = (arr3[l / 2 - 1] + arr3[l / 2]) / 2.0;
        } else {
            median = arr3[l / 2];
        }

        System.out.println("Median of merged array: " + median);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        mergeArrays(arr1, arr2);
    }
}
