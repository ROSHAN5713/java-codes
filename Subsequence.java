public class Subsequence {
    public static void main(String[] args) {
        String s = "amc";
        String t = "vamc";

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        boolean result = (i == s.length());

        System.out.println("Is " + s + " a subsequence of " + t + " ? ");
        System.out.println(" Ans : " + result);
    }
}
