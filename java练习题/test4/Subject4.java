
/**
 * 【程序4】
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
import java.util.Scanner;

public class Subject4 {

    public static void main(String[] args) {

        System.out.print("请输入需要分解因数的整数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("因子为：");

        decompose(a);
    }

    /**
     * 分解质因数
     * 
     * @param a
     */
    private static void decompose(int a) {

        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                System.out.println(i);
                a /= i;
            }
        }
        System.out.println(a);
    }
}