package task02.task02;

public class Trade {

    public static void main(String[] args) {
        //定义一家银行（给静态变量赋值，可以直接使用类名访问）
        Bank.bankName = "招商银行";
        //调用静态方法，银行打印欢迎语句
        Bank.welcome();
        //通过构造方法进行开户
        Bank bank = new Bank("小王", "123456", 100.0);
        //进行存款操作
        bank.deposit(500.0);
        //取款时密码输入错误，取款失败
        bank.withdrawal("654321", 200.0);
        //取款时余额不足，取款失败
        bank.withdrawal("123456", 1000.0);
        //取款时密码输入正确，余额充足，取款成功
        bank.withdrawal("123456", 200.0);
        //调用静态方法，银行打印道别语句
        bank.welcomeNext();
    }

}