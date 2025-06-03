class Sum {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class methodoverriding{
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.add(10, 20));
        System.out.println(sum.add(10, 20));
    }
}