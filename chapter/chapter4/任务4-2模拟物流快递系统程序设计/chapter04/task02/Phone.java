package chapter04.task02;

/**
 * 手机类 实现gps接口
 */
class Phone implements Gps {

    public Phone() {
        super();
    }

    public String showCoordinate() {
        String location = "193,485";
        return location;
    }

}