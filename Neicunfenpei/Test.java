package Neicunfenpei;

/**
 * Test
 */

//  栈里分配了aa1，aa2指针
// aa1->10  aa2->10 指向堆里不同的两个 10
// aa1 = aa2  aa1 指向 aa2 的堆里的 10
// aa1->20  把aa1 aa2指向的相同堆里的10改为20
// aa2->20 

class A {
    public int i = 10;
    
    public void show() {
        System.out.printf("%d\n",i);
    }
}

public class Test {

    public static void main(String[] args) {
        A aa1 = new A();
        A aa2 = new A();
        aa1 = aa2;
        aa1.i = 20;
        aa2.show();
    }
}