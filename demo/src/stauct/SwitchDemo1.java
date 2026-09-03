package stauct;

public class SwitchDemo1 {
    public static void main(String[] args) {
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入的成绩不合法");
        }
    }
}
