//@author Max Granger

public interface State {
    public int getNum();
    public Operation getOperation();
    public void increaseDifficulty();
    public void decreaseDifficulty();
}
