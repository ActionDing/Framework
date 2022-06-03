package xyz.actionding.springdemo;

/**
 * @author Actionding
 * @create 2022-06-03 15:22
 */
public class HelloWorld {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void getMsg() {
        System.out.println("msg: " + msg);
    }
}
