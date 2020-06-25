
import java.util.LinkedList;
import java.util.Scanner;

public class KTVByLinkedList {

    public static void main(String[] args) {

        System.out.println("--------------欢迎来到点歌系统-----------------");
        System.out.println("0.添加歌曲至列表");
        System.out.println("1.将歌曲置顶");
        System.out.println("2.将歌曲前移一位");
        System.out.println("3.退出");
        LinkedList lineUpList = new LinkedList();// 创建歌曲列表
        addMusicList(lineUpList);// 添加一部分歌曲至歌曲列表
        while (true) {
            System.out.println("请输入需要执行的操作序号：");
            Scanner scan = new Scanner(System.in);
            int command = scan.nextInt();// 接收键盘输入的功能选项序号
            // 执行序号对应的功能
            switch (command) {
                case 0:// 添加歌曲至列表
                    addMusic(lineUpList);
                    break;
                case 1:// 将歌曲置顶
                    setTop(lineUpList);
                    break;
                case 2:// 将歌曲前移
                    setBefore(lineUpList);
                    break;
                case 3:// 退出
                    exit();
                    break;
                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("功能选择有误，请输入正确的功能序号");
                    break;
            }
            System.out.println("当前歌曲列表：" + lineUpList);
        }
    }

    private static void exit() {
        System.out.println("-----------------退出--------------------");
        System.out.println("您已退出系统");
        System.exit(0);;
    }

    /**
     * 执行将歌曲前置一位
     * 
     * @param lineUpList
     */
    private static void setBefore(LinkedList lineUpList) {
        System.out.println("请输入要置前的歌曲名称：");
        String musicName = new Scanner(System.in).nextLine();
        int position = lineUpList.indexOf(musicName);// 查找指定位置歌曲
        if (position < 0) {// 判断歌曲是否存在
            System.out.println("列表中没有输入的歌曲！");
        } else if (position == 0) {// 判断歌曲是否已在第一位
            System.out.println("当前歌曲已置顶！");
        } else {
            lineUpList.remove(musicName);// 移除指定的歌曲
            lineUpList.add(position - 1, musicName);// 将指歌曲放到第一位
        }
        System.out.println("已将歌曲" + musicName + "前置一位");
    }

    /**
     * 执行将歌曲置顶
     * 
     * @param lineUpList
     */
    private static void setTop(LinkedList lineUpList) {
        System.out.println("请输入要置顶的歌曲名称：");
        String musicName = new Scanner(System.in).nextLine();
        int position = lineUpList.indexOf((musicName));// 查找指定位置歌曲
        if (position < 0) {// 判断歌曲是否存在
            System.out.println("列表中没有输入的歌曲！");
        } else {
            lineUpList.remove(musicName);// 移除指定的歌曲
            lineUpList.addFirst(musicName);// 将指歌曲放到第一位
        }
        System.out.println("已将歌曲" + musicName + "置顶");
    }

    /**
     * 执行添加歌曲
     * 
     * @param lineUpList
     */
    private static void addMusic(LinkedList lineUpList) {
        System.out.println("请输入要添加的歌曲名程：");
        String musicName = new Scanner(System.in).nextLine();
        lineUpList.addLast(musicName);// 添加歌曲到列表的最后
        System.out.println("已添加歌曲：" + musicName);
    }

    /**
     * 初始时添加歌名
     * 
     * @param lineUpList
     */
    private static void addMusicList(LinkedList lineUpList) {
        lineUpList.add("稻香");
        lineUpList.add("夜曲");
        lineUpList.add("夜的第七章");
        lineUpList.add("听妈妈的话");
        lineUpList.add("龙卷风");
        System.out.println("初始歌曲列表：" + lineUpList);
    }
}