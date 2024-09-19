//@author Max Granger
import java.util.ArrayList;
import java.util.Random;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand = new Random();
    private ArrayList<Question> questions;

    private TriviaGame() {}

    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public Question getQuestion() {
        if (questions == null) {
            questions = DataLoader.getTriviaQuestions();
        }
        return questions.get(rand.nextInt(9));
    }

    public boolean hasMoreQuestions() {
        if (numGames < 10) {
            return true;
        }
        return false;
    }

    public void winRound() {
        numGames++;
        score++;
    }

    public void loseRound() {
        numGames++;
    }

    public String getScores() {
        return "Score: " + score + "/" + numGames;
    }
}
