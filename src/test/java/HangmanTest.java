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
}
