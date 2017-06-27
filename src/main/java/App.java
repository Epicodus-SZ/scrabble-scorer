import java.io.Console;

public class App {
  public static void main(String[] args){
    // console object so we can collect data from user
    Console myConsole = System.console();
    System.out.println("What's your word?");
    String word = myConsole.readLine();

    Scrabble wordScrabble = new Scrabble();
    System.out.println("You're word score is =" + wordScrabble.calculateScore(word));



  }
}
