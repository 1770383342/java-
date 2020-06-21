package task02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字符串排序
 */
public class WrapperTest {

    private static final String SPACE_SEPARATOR = " ";

    public static void main(String[] args) {

        System.out.println("请输入需要排序的数组，用空格隔开");
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        numStr = sortStringNumber(numStr);
        System.out.println(numStr.toString());
    }

    private static String sortStringNumber(String numStr) {
        // 1，将字符串变成字符数组
        String[] str_arr = stringToArray(numStr);
        // 2，将字符串数组变成int数组
        int[] num_arr = toIntArray(str_arr);
        // 3，对int数组排序
        mySortArray(num_arr);
        // 4，将排序后的int数组变成字符串
        String temp = arrayToString(num_arr);
        return temp;
    }

    private static String arrayToString(int[] num_arr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num_arr.length; i++) {
            if (i != num_arr.length - 1) {
                sb.append(num_arr[i] + SPACE_SEPARATOR);
            } else {
                sb.append(num_arr[i]);
            }
        }
        return sb.toString();
    }

    private static void mySortArray(int[] num_arr) {
        Arrays.sort(num_arr);
    }

    private static int[] toIntArray(String[] str_arr) {
        int[] arr = new int[str_arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }
        return arr;
    }

    private static String[] stringToArray(String numStr) {
        String[] str_arr = numStr.split(SPACE_SEPARATOR);
        return str_arr;
    }
}