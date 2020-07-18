
public class test1 {

    public static void main(String[] args) {

        int a = 54628, b = 266483;
        System.out.println(Zuixiao(a, b));
    }

    /**
     * 最小公约数
     * 
     * @param a
     * @param b
     * @return
     */
    private static int Zuixiao(int a, int b) {

        int min, i;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }

        for (i = 2; i < min; i++) {
            if (a % i == 0 && b % i == 0) {
                break;
            }
        }

        if (i == min) {
            return 0;
        } else {
            return i;
        }
    }
}