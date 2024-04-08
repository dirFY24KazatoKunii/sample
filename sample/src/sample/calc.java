package sample;

import java.awt.print.Printable;

public class calc {

    public static void main(String[] args) {
        var num1 = 99;
        var num2 = 10;
        
        //足し算
        var result1 = num1 + num2 ;
        System.out.println("num1+num2=" + result1);
        
        //引き算
        var result2 = num1 - num2 ;
        System.out.println("num1-num2=" + result2);
        
        //掛け算
        var result3 = num1 * num2 ;
        System.out.println("num1×num2=" + result3);
        
        //割り算
        var result4 = num1/num2 ;
        System.out.println("num1÷num2=" + result4);
        
        //剰余
        var result5 = num1%num2 ;
        System.out.println("num1%num2=" + result5);
        
        System.out.println("num1÷num2=" + result4+ "余り" +result5);

    }

}
