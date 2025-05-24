public class jwelsandstones {
    public static void main(String[] args) {
        String s = "aAAbbabbababb";
        String j = "Ab";
        
        System.out.println(numJewelsInStones(s, j));
        }
        public static int numJewelsInStones(String s, String j) {
            int count = 0;
            for (int i = 0; i<s.length();i++){
                if (j.indexOf(s.charAt(i))!=-1){
                    count++;
                }
            }
                return count;
        }
}