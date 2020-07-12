
public class test1 {

    public static void main(String[] args) {

        int a = 345;
        int sum1 = a / 100;// 百位
        int sum2 = a / 10 - sum1 * 10;// 十位
        int sum3 = a - sum1 * 100 - sum2 * 10;// 个位

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}