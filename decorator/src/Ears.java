/* Written by Max Granger */

public class Ears extends CharacterDecorator {
    private Character character;

    /**
     * @param character character decor is being added to
     */
    public Ears(Character character) {
        super(character);
        this.character = character;
        integrateDecor(FileReader.getLines("txt/ears.txt"));
    }
}