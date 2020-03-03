package GouZaohanshu.Test3;

/**
 * Test3
 */

class A1 {
    public int i = 1;
    public boolean falg = false;
    
    public A1(int j, boolean falg2) {   //会输出构造函数修改过后的值
        i = j;
        falg = falg2;
    }

    public void show() {
        System.out.printf("%d\n", i); //默认为0
        System.out.printf("%b\n", falg); //默认为false
    }
}

public class Test3 {

    public static void main(String[] args) {
        A1 aa = new A1(88,true);
        aa.show();

        //int k;    //局部变量编译器不会自动进行初始化，java要求所有的局部变量在使用之前都必须进行初始化
        //System.out.printf("%d",k);        //未初始化变量k
    }
}