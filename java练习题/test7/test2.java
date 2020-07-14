
public class test2 {

    public static void main(String[] args) {

        int a = 24, b = 50;
        System.out.println(Gcd(a, b));
        int m = (a * b) / Gcd(a, b);
        System.out.println(m);
    }

    /**
     * 最大公约数
     * 
     * @param a
     * @param b
     * @return
     */
    private static int Gcd(int a, int b) {

        int min, i;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }

        for (i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                break;
            }
        }

        return i;
    }
}