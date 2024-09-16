//@author Max Granger

public class Easy implements State {
    private ArithmeticGame game;

    /** Default constructor
     * @param game current game
     */
    public Easy(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * @return random number 1-10
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 10) + 1;
    }

    /**
     * @return plus or minus based on random number generation
     */
    @Override
    public Operation getOperation() {
        int num = (int) Math.random();
        if (num == 0) {
            return Operation.PLUS;
        } else {
            return Operation.MINUS;
        }
    }

    /**
     * increases difficulty
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("You've advanced to Medium difficulty!");
        game.setState(game.getMediumState());
    }

    /**
     * decreases difficulty
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("Study harder!");
    }
}
