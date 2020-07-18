
public class test3 {

    public static void main(String[] args) {

        int a = 4, b = 6;
        System.out.println(Lcm(a, b));
        int m = (a * b) / Lcm(a, b);
        System.out.println(m);
    }

    /**
     * 最大公约数
     * 
     * @param a
     * @param b
     * @return
     */
    private static int Lcm(int a, int b) {

        int min, i, m = 1;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }

        for (i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                m = m * i;
                a = a / i;
                b = b / i;
                i = 1;
            }
        }

        return m;
    }
}