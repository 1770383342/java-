
public class Example10 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();// 循环开始时的当前时间
        int sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += 1;
        }
        long endTime = System.currentTimeMillis();// 循环结束时间的当前时间
        System.out.println("程序运行时间为：" + (endTime - startTime) + "毫秒");
    }
}