package sample;

public class MethodReveiw {
    public static void main(String[] args) {
        var num1 =100;
        var num2 =10;
        sumMethod1(num1,num2);
        
        var result2 = sumMethod2(num1, num2);
        System.out.println("sumMethod2の結果は" + result2);
        }
    public static void sumMethod1(int num1, int num2) {
        var result = num1 + num2;
        System.out.println("sumMethod1の結果は" + result);
    }
    public static int sumMethod2(int num1, int num2) {
        var result = num1 + num2;
        return result;
    }
    
  
      
  }
    
