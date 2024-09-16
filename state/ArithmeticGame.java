//@author Max Granger

public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Default constructor
     */
    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        this.score = 0;
    }

    /**
     * @return generated question according to current state
     */
    public Question getQuestion() {
        return new Question(state.getNum(), state.getNum(), state.getOperation());
    }

    /**
     * increases score if score % 3
     */
    public void increaseScore() {
        score = score + 1;
        if (score % 3 == 0) {
            state.increaseDifficulty();
        }
    }

    /**
     * decreases score if score % 3
     */
    public void decreaseScore() {
        score = score - 1;
        if (score % 3 == 0) {
            state.decreaseDifficulty();
        }
    }

    /**
     * @param state state to be set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return the generated easy state
     */
    public State getEasyState() {
        return this.easyState;
    }

    /**
     * @return the generated medium state
     */
    public State getMediumState() {
        return this.mediumState;
    }

    /**
     * @return the generated hard state
     */
    public State getHardState() {
        return this.hardState;
    }
}
