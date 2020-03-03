package Sanjiaoxing;

/**
 * TestTriangle
 */
class Triangle{
    int a;
    int b;
    int c;
    int zhouchang(){
        return a+b+c;
    }
    double area(){
        double p=1.0*(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

class TestTriangle {
    public static void main(String[] args) {
        Triangle s=new Triangle();

        s.a = 3;
        s.b = 4;
        s.c = 5;
        System.out.printf("%d %f\n",s.zhouchang(),s.area());
    }

    
}