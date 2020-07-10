import java.util.Scanner;

/**
 * Subject1
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？ 分析
 * 一月 1对， 2月 1对，3月 2对，4月 3对，5月5对，6月8对，7月13对，8月 21只
 */
public class Subject1 {

    public static void main(String[] args) {

        System.out.println("请输入你想知道的兔子数量的月份：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// 获取输入的月份
        System.out.println(test1(n));
        System.out.println(test2(n));
    }

    private static int test2(int i) {
        int tot = 0;
        int a = 0;
        int b = 1;
        for (int j = 0; j < i; j++) {
            tot = a + b;
            a = b;
            b = tot;
        }
        return a;
    }

    private static int test1(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return test2(n - 1) + test2(n - 2);
    }

}