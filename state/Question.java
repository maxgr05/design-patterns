//@author Max Granger

public class Question {
    private String question;
    private int answer;

    /**
     * @param num1 number 1
     * @param num2 number 2
     * @param operation operation to be used
     */
    public Question(int num1, int num2, Operation operation) {
        if (operation == Operation.PLUS) {
            answer = num1 + num2;
            question = num1 + " + " + num2 + " = ";
        } else if (operation == Operation.MINUS) {
            answer = num1 - num2;
            question = num1 + " - " + num2 + " = ";
        } else if (operation == Operation.MULTIPLY) {
            answer = num1 * num2;
            question = num1 + " * " + num2 + " = ";
        } else if (operation == Operation.DIVIDE) {
            answer = num1 / num2;
            question = num1 + " / " + num2 + " = ";
        }
    }

    /**
     * @return string version of question
     */
    public String toString() {
        return question;
    }

    /**
     * @return answer to currect question
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * @param answer if the answer matches current answer
     * @return true or false
     */
    public boolean isCorrect(int answer) {
        if (this.answer == answer) {
            return true;
        }
        return false;
    }
}
