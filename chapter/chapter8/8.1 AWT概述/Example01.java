import java.awt.*;

public class Example01 {

    public static void main(String[] args) {
        
        //建立新窗体对象
        Frame f = new Frame("我的窗体");
        //设置窗体的宽高
        f.setSize(500, 400);
        //设置窗体在屏幕中所在的位置（参数是左上角坐标）
        f.setLocation(800, 300);
        //设置窗口可见
        f.setVisible(true);
    }    
}