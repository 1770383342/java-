import java.util.Random;

public class Example17 {

    public static void main(String[] args) {

        Random r = new Random(13);// 传入种子
        // 随机产生10个【0，100】之间的整数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}