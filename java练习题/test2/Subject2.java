
/**
 * 【程序2】 题目：判断101-200之间有多少个素数，并输出所有素数。
 *
 * 分析：什么是素数，不能被自己和1整除的数。
 */
public class Subject2 {

    public static void main(String[] args) {

        int a = 10100, b = 10300, sum = 0;
        for (int i = a; i < b; i++) {
            if (isPrimeNumber1(i)) {
                System.out.println(i);
                sum++;
            }
        }
        System.out.println("共有" + sum + "个素数");
    }

    /**
     * 判断一个数是否是素数
     * 
     * @param n
     * @return
     */
    private static boolean isPrimeNumber1(int n) {

        boolean a = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                // System.out.println(n);
                a = false;
                break;
            }
        }
        return a;
    }
}