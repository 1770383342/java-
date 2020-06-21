import java.io.IOException;

public class Example14 {

    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime rt = Runtime.getRuntime();// 创建Runtime实例对象
        Process process = rt.exec("notepad.exe");// 调用exec()方法
        Thread.sleep(3000);// 程序休眠3秒
        process.destroy();// 杀掉程序
    }
}