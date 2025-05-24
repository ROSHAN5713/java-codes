public class missingcharstring {
    public static void main(String[] args) {
        String s = "vamc";
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alpha.length(); i++) {
            String ch = alpha.substring(i, i + 1);
            if (s.indexOf(ch) == -1) {
                System.out.println("Smallest missing character: " + ch);
                break;
            }
        }
    }
}