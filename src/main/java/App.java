import java.io.Console;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args){
      Console console = System.console();

      List<String> myAnswers = Arrays.asList("ford", "rangerover", "mercedesbenz", "bmw", "jaguar", "audi");
      Hangman myGame = new Hangman(myAnswers);

      System.out.println("Welcome to the game Hangman:");
      System.out.println("Kindly guess our mystrey word.");
      System.out.println("Hint: cars");


    }
}
