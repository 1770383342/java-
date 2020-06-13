package HanSHUchongzai;

/**
 * Test1
 */
public class Test1 {

    //同名的函数通过不同的形参做类似的事情叫做函数的重载
    //函数重载要求
    //1.函数的形参个数
    //2.函数的形参顺序
    //3.函数的形参数据类型
    //这三个至少有一个是不一样的
    
    static int add(int a, int b) {
        return a + b;
    }

    //如果两个函数只是函数的返回值不一样，其他都一样，这构不成函数的重载，会报错
    //static double add(int a, int b) {
    //    return a + b;
    //}
         
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.printf("%d\n", add(1, 2));
        System.out.printf("%d\n", add(1, 2, 3, 4));
        System.out.printf("%f\n", add(1.1, 2.2));
    }
}