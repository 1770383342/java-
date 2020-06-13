package ThisZhiZhen.Test3;

/**
 * Student
 */

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInformation() {
        System.out.printf("name = %s,age = %d\n",name,age);
    }

    public static void main(String[] args) {
        
    }
}