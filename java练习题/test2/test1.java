import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isPrimeNumber(n)) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }

    }

    /**
     * 判断一个数是否是素数
     * 
     * @param n
     * @return
     */
    private static boolean isPrimeNumber(int n) {

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