/* Written by Max Granger */

public class Mouth extends CharacterDecorator {
    private Character character;

    /**
     * @param character character decor is being added to
     */
    public Mouth(Character character) {
        super(character);
        this.character = character;
        integrateDecor(FileReader.getLines("txt/mouth.txt"));
    }
}
