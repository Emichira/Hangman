import java.io.Console;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args){
      Console console = System.console();

      List<String> myAnswers = Arrays.asList("ford", "rangerover", "mercedesbenz", "bmw", "jaguar", "audi");
      Hangman myGame = new Hangman();
      myGame.hangman(myAnswers);

      System.out.println("Welcome to the game Hangman:");
      System.out.println("Kindly guess our mystrey word.");
      System.out.println("Hint: cars");

      while (!myGame.mAnswer.equals(myGame.mGuessed)) {
          System.out.println(myGame.mGuessed);
          String myGuess = console.readLine();
          myGame.getGuessedLetter(myGuess);
      }

      System.out.println("Well done, you have 5 more attempts");


    }
}
