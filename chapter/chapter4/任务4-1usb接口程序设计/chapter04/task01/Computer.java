package chapter04.task01;

/**
 * 计算机
 */
public class Computer {
    // 计算机上的USB槽
    private USB[] usbArr = new USB[4];

    /**
     * 向计算机上连接一个usb设备
     * 
     * @param usb
     */
    public void add(USB usb) {
        // 循环遍历所有插槽
        for (int i = 0; i < usbArr.length; i++) {
            // 如果发现是一个空的
            if (usbArr[i] == null) {
                // 将usb设备连接到插槽上
                usbArr[i] = usb;
                // 连接之后结束循环
                break;
            }
        }
    }

    /**
     * 计算机的开机功能
     */
    public void powerOn() {
        //循环遍历所有插槽
        for (int i = 0; i < usbArr.length; i++) {
            //将usb设备启动
            if (usbArr[i] != null) {
                //将usb设备启动
                usbArr[i].turnOn();
            }
        }
        System.out.println("计算机开机成功");
    }

    /**
     * 计算机关机功能
     */
    public void powerOff() {
        for (int i = 0; i < usbArr.length; i++) {
            if (usbArr[i] != null) {
                usbArr[i].turnOff();
            }
        }
        System.out.println("计算机关机成功");
    }
}