
/**
 * 从一的阶乘加到二十的阶乘的和
 */
public class Subject1 {

    public static void main(String[] args) {

        // int a = 5;
        // System.out.println(factorial(a));
        long n = 0;

        for (int i = 1; i <= 20; i++) {
            n = factorial(i) + n;
        }
        System.out.println(n);

    }

    /**
     * 阶乘
     * 
     * @param a
     * @return
     */
    private static long factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return factorial(a - 1) * a;
        }
    }
}