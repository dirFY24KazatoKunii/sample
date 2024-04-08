package sample;

public class reviewTest {

    public static void main(String[] args) {
        var num1=100;
        var num2=10;
        sumMethod(num1,num2);
    }
    public static void sumMethod(int num1,int num2) {
        var result=num1 + num2;
        System.out.println("sumMethodの合計は" + result);
    }

}
