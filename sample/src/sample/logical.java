package sample;

public class logical {

    public static void main(String[] args) {
    int score = 59 ;//成績
    
     //and　scoreが40以上かつ50以下；
    System.out.print("scoreが40以上、かつ50以下:");
    System.out.println(score >= 40 && score <= 50);
    
    // or:scoreが40以上、または50以下
    System.out.print("scoreが40以上、または50以下：");
    System.out.println(score >= 40 || score <= 50);

    // not:scoreが60以上ではない
    System.out.print("scoreが60以上ではない：");
    System.out.println(!(score >= 60));
    
    //not:scoreが59じゃない
    System.out.print("scoreが59ではない");
    System.out.println(score != 59) ;
    
    //a君の点数と等しいか
    
    var AScore = 60;
            System.out.print("A君はscoreより高い");
            System.out.println(AScore > score);
            
    
    
    }
    
}
