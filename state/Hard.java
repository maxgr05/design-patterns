//@author Max Granger

public class Hard implements State {
    private ArithmeticGame game;

    /** Default constructor
     * @param game current game
     */
    public Hard(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * @return random number 1-50
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 50) + 1;
    }

    /**
     * @return plus, minus, multiplication or division based on random number generation
     */
    @Override
    public Operation getOperation() {
        int num = (int)(Math.random() * 4) + 1;
        if (num == 2) {
            return Operation.MINUS;
        } else if (num == 3) {
            return Operation.MULTIPLY;
        } else if (num == 4) {
            return Operation.DIVIDE;
        } else {
            return Operation.PLUS;
        }
    }

    /**
     * increases difficulty
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("You're awesome at this!");
    }

    /**
     * decreases difficulty
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("You've been demoted to Medium difficulty.");
        game.setState(game.getMediumState());
    }
}
