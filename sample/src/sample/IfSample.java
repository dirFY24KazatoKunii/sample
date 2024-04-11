package sample;

public class IfSample {

    public static void main(String[] args) {
        int a = 5, b = 5, c = 5;
        String result;
        if (a==b && b==c && a==c) {
            System.out.println("正三角形");
        } else {
            System.out.println("正三角形ではない");
        }
    }

}


