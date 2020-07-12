/**
 * 【程序3】
 * 题目：打印出所有的”水仙花数”，所谓”水仙花数”是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个”水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方。
 */

public class Subject3 {

    public static void main(String[] args) {

        for (int i = 100; i < 999; i++) {
            if (isNarcissus(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isNarcissus(int a) {

        int sum1 = a / 100;// 百位
        int sum2 = a / 10 - sum1 * 10;// 十位
        int sum3 = a - sum1 * 100 - sum2 * 10;// 个位
        boolean flag = false;

        if (sum1 * sum1 * sum1 + sum2 * sum2 * sum2 + sum3 * sum3 * sum3 == a) {
            flag = true;
        }

        return flag;
    }
}