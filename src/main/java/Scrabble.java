import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Scrabble {


  public Integer calculateScore(String word){
    Integer score = 0;

    Map<String,Integer> tileMap = new HashMap<String,Integer>();
    tileMap.put("A", 1);
    tileMap.put("B", 3);

    for (Character ch : word.toCharArray()) {
      System.out.println(">>"+word+"<<"+ch+" score:"+score);
      System.out.println(score);

      //test code
      System.out.println("score is " + score.getClass());
      System.out.println("ch is " + ch);
      if (isAlpha(ch)) {
       System.out.println("woohoo" + ch);
      }
      // if(ch.equals("A")){
      //   System.out.println("char is "+tileMap.get(ch));
      //   score = score + tileMap.get(ch);
      // }



    }

    return score;
  }

}
