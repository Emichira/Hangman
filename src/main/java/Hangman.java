import java.util.*;

public class Hangman {
  public String mAnswer;
  public String mGuessed;

  //gets a random word from our answers array
  String guessedLetters(List<String> setAnswers){
      Random newRandomGenerator = new Random();
      int answerIndex = newRandomGenerator.nextInt(setAnswers.size());
      mAnswer = setAnswers.get(answerIndex);

      String[] answerLetters = mAnswer.split("");
      StringBuilder toSplit = new StringBuilder();
      for(int j=0;j<answerLetters.length;j++){
          toSplit.append("_");
      }
      mGuessed = (toSplit.toString());
      return mAnswer;
  }
  }

}
