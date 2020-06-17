package chapter04.task02;

/**
 * 测试类
 */
public class Task02Test {

    public static void main(String[] args) {

    //快递任务类对象
    SendTask task = new SendTask("HYX600235", 76.34);
    //调用送前准备
    task.sendBefore();
    System.out.println("========================");
    //创建交通工具对象
    ZTransportation t = new ZTransportation("2025", "奔驰", "小李");
    //创建gps工具对象
    Phone p = new Phone();
    //将交通工具和gps传入送货方式
    task.send(t, p);
    System.out.println("========================");
    //调用送后操作方法
    task.sendAfter(t);
    t.upKeep();
    }
}