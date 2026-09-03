package stauct;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String a = "小范";
        switch (a) {
            case "小范":
                System.out.println("小范");
                break;
            case "小明":
                System.out.println("小明");
                break;
            case "小红":
                System.out.println("小红");
                break;
            default:
                System.out.println("没有这个人");
        }
    }
}
