import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class HangmanTest {
  @Test
  public void hangman_atLeastReturnsAString_String(){
    Hangman testGame = new Hangman();
    List<String> myAnswer = Arrays.asList("ford");
    String guessedLetter = testGame.guessedLetters(myWord);
    assertEquals(true, computerChoice!=null);
  }
  @Test
  public void hangman_returnsARandomWordFromStringAnswerList_String() {
    Hangman game = new Hangman();
    List<String> myAnswers = Arrays.asList("ford", "rangerover", "mercedesbenz", "bmw", "jaguar", "audi");
    String hangmanChoice = game.hangman(myAnswers);
    assertEquals(true,myAnswers.contains(hangmanChoice));
  }
  @Test
  public void getGuessedLetter_returnsStringDashEqualToStringLength_String();
    Hangman game = new Hangman();
    game.mAnswer = "ford";
    String choosedAnswer = game.getGuessedLetter("");
    assertEquals("____", choosedAnswer);
  @Test
  public void getGuessedLetter_returnsStringWithGuessedLetter_String(){
    Hangman game = new Hangman();
    game.mAnswer = "ford";
    String choosedAnswer = game.getGuessedLetter("f");
    assertEquals("f___",choosedAnswer);
  }

}
