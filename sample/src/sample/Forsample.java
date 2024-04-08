package sample;

public class Forsample {

    public static void main(String[] args) {
        for (var i=1 ; i <=10 ; i++) {
        System.out.println(i);
        }
        
        for (int X=2; X<=20; X+=2) {
            System.out.println(X);
        }
        
        for (int Y=1; Y<=20; Y++) {
            if (Y % 2 ==1) {
                System.out.println(Y);
            }
        }
    }

}
