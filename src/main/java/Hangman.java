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
  String getGuessedLetter(String myGuess) {
    String[] myLetters = mAnswer.split("");
    StringBuilder result = new StringBuilder();
    String[] myGuessed;

    if(mGuessed !=null) {
      myGuessed = mGuessed.split("");
    } else {
      String[] answerLetters = mAnswer.split("");
      StringBuilder toSplit = new StringBuilder();
      for(int j=0; j<answerLetters.length; j++) {
        toSplit.append("_");
      }

      myGuessed = (toSplit.toString()).split("");
    }

    for(int i=0;i<myLetters.length;i++){
      if((myGuessed[i]).equals("_")) {
        if((myLetters[i]).equals(myGuess)) {
          result.append(myGuess);
        } else {
          result.append("_");
        }
      } else {
        result.append(myGuessed[i]);
      }
    }
    mGuessed = result.toString();
    return mGuessed;

  }
}
