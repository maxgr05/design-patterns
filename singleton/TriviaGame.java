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

    /**
     * @return current instance of TriviaGame
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * @return a random question based on length of list, deletes the question
     */
    public Question getQuestion() {
        if (questions == null) {
            questions = DataLoader.getTriviaQuestions();
        }
        int randInt = rand.nextInt(questions.size());
        Question currQ = questions.get(randInt);
        questions.remove(randInt);
        return currQ;
    }

    /**
     * @return bool if the number of games is less than 10
     */
    public boolean hasMoreQuestions() {
        if (numGames < 10) {
            return true;
        }
        return false;
    }

    /**
     * increase score + number of games
     */
    public void winRound() {
        numGames++;
        score++;
    }

    /**
     * increase number of games only
     */
    public void loseRound() {
        numGames++;
    }

    /**
     * @return score/numGames in string format
     */
    public String getScores() {
        return "Score: " + score + "/" + numGames;
    }
}
