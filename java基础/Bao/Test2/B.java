package Bao.Test2;

/**
 * B
 */

// 同包访问

public class B {

    public static void main(String[] args) {
        A aa = new A();
        aa.f();
    }
}