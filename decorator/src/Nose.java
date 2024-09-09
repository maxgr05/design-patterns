/* Written by Max Granger */

public class Nose extends CharacterDecorator {
    private Character character;

    /**
     * @param character character decor is being added to
     */
    public Nose(Character character) {
        super(character);
        this.character = character;
        integrateDecor(FileReader.getLines("txt/nose.txt"));
    }
}
