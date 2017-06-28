import java.util.*;

public class Scrabble {

  public Integer calculateScore(String word){
    Integer score = 0;

    Map<String,Integer> tileMap = new HashMap<String,Integer>();
    tileMap.put("A", 1);
    tileMap.put("B", 3);
    tileMap.put("C", 3);
    tileMap.put("D", 2);
    tileMap.put("E", 1);
    tileMap.put("F", 4);
    tileMap.put("G", 2);
    tileMap.put("H", 4);
    tileMap.put("I", 1);
    tileMap.put("J", 8);
    tileMap.put("K", 5);
    tileMap.put("L", 1);
    tileMap.put("M", 3);
    tileMap.put("N", 1);
    tileMap.put("O", 1);
    tileMap.put("P", 3);
    tileMap.put("Q", 10);
    tileMap.put("R", 1);
    tileMap.put("S", 1);
    tileMap.put("T", 1);
    tileMap.put("U", 1);
    tileMap.put("V", 4);
    tileMap.put("W", 4);
    tileMap.put("X", 8);
    tileMap.put("Y", 4);
    tileMap.put("Z", 10);

    char[] charArray = word.toCharArray();
    
    for (char ch : charArray) {
      if (Character.isLetter(ch)){
        int letterValue = tileMap.get(String.valueOf(ch).toUpperCase());
        score = score + letterValue;
        System.out.println("Letter <<"+String.valueOf(ch)+">> is worth "+letterValue+" points...");
      } else {
        System.out.println("not a letter");
      }
      
      }

    return score;
  }

}
