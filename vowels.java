public class vowels {
    public static void main(String[] args) {
        String s = "aeiouAEIOU", v = " parul university", c = "";
        for (int i = 0; i < v.length(); i++) {
            String ch = v.substring(i, i + 1);
            int count = 0;
            for (int j = 0; j < s.length(); j++)
                if (s.substring(j, j + 1).equals(ch)) count++;
            if (count > 0)
                System.out.println(ch + ": " + count);
        }
    }
}