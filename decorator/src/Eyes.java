/* Written by Max Granger */

public class Eyes extends CharacterDecorator {
    private Character character;

    /**
     * @param character character decor is being added to
     */
    public Eyes(Character character) {
        super(character);
        this.character = character;
        integrateDecor(FileReader.getLines("txt/eyes.txt"));
    }
}
