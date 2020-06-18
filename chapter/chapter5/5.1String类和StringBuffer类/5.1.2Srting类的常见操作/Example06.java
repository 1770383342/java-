
public class Example06 {

    public static void main(String[] args) {

        String str = "羽毛球-篮球-乒乓球";
        // 下面是字符串截取操作
        System.out.println("才第5个字符截取到末尾的结果：" + str.substring(4));
        System.out.println("从第5个字符截取到第6个字符结果：" + str.substring(4, 6));
        // 下面是字符串分割操作
        System.out.println("分割后的字符串数组中的元素依次为：");
        // 将字符串转换为字符串数组
        String[] strArray = str.split("-");

        for (int i = 0; i < strArray.length; i++) {
            if (i != strArray.length - 1) {
                // 如果不是数组的最后一个约束，在元素前面加逗号
                System.out.println(strArray[i] + ",");
            } else {
                // 数组的最后以后元素后面不加逗号
                System.out.println(strArray[i]);
            }
        }

    }

}