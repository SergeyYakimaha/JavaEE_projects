public class Calculator {

    public int param;
    public static int staticParam;

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus (int a, int b) {
        return a - b;
    }

    public int squared(int a) {
        return a * a;
    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }
}
