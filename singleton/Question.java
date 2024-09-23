//@author Max Granger
import java.util.Collections;
import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> answers = new ArrayList<String>();
    private int correctAnswer;

    /**
     * @param question string question
     * @param correctAnswer int index of correct answer
     * @param answers arraylist of string ansers
     */
    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        Collections.addAll(this.answers, answers);
    }

    /**
     * @return string representation of question + answers
     */
    public String toString() {
        return question + "\n  1. " + answers.get(0) + "\n  2. " + answers.get(1) + "\n  3. " + answers.get(2) + "\n  4. " + answers.get(3);
    }

    /**
     * @param userAnswer int index of user's answer
     * @return bool if matches correct answer
     */
    public boolean isCorrect(int userAnswer) {
        if (userAnswer == correctAnswer + 1) {
            return true;
        }
        return false;
    }

    /**
     * @return string of correct answer
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }
}
