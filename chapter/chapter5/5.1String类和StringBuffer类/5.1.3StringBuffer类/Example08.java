
public class Example08 {

    public static void main(String[] args) {

        System.out.println("1. 添加------------------");
        add();
        System.out.println("2. 删除------------------");
        remove();
        System.out.println("3. 修改------------------");
        alter();
        System.out.println("-------------------------");
        aiXin();
    }

    public static void add() {
        // 定义一个字符串缓冲区
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");// 在末尾添加字符串
        System.out.println("inster添加结果：" + sb);
        sb.insert(2, "123");// 在指定位置插入字符串
        System.out.println("insert添加结果：" + sb);
    }

    public static void remove() {

        StringBuffer sb = new StringBuffer("abcdefg");
        sb.delete(1, 5);// 指定范围删除
        System.out.println("删除指定范围结果：" + sb);
        sb.deleteCharAt(2);// 指定位置删除
        System.out.println("删除指定位置结果：" + sb);
        sb.delete(0, sb.length());// 清空缓冲区
        System.out.println("清空缓冲区结果：" + sb);
    }

    public static void alter() {
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.setCharAt(1, 'p');// 修改指定位置字符
        System.out.println("修改指定位置字符结果：" + sb);
        sb.replace(1, 3, "qq");// 替换指定位置字符串或字符
        System.out.println("替换指定位置字符串或字符结果：" + sb);
        System.out.println("字符串翻转结果：" + sb.reverse());
    }

    /**
     * 爱心
     */
    public static void aiXin() {

        for (float y = (float) 1.5; y > -1.5; y -= 0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    System.out.print("^");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}