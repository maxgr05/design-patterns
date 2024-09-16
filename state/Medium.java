//@author Max Granger

public class Medium implements State{
    private ArithmeticGame game;

    /** Default constructor
     * @param game current game
     */
    public Medium(ArithmeticGame game) {
        this.game = game;
    }

    /**
     * @return random number 1-25
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 25) + 1;
    }

    /**
     * @return plus, minus or multiplication based on random number generation
     */
    @Override
    public Operation getOperation() {
        int num = (int) (Math.random() * 3) + 1;
        if (num == 2) {
            return Operation.MINUS;
        } else if (num == 3) {
            return Operation.MULTIPLY;
        } else {
            return Operation.PLUS;
        }
    }

    /**
     * increases difficulty
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("You've advanced to Hard difficulty!");
        game.setState(game.getHardState());
    }

    /**
     * decreases difficulty
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("You've been demoted to Easy difficulty.");
        game.setState(game.getEasyState());
    }
}
