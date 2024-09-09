/* Written by Max Granger */

public class Hat extends CharacterDecorator {
    private Character character;

    /**
     * @param character character decor is being added to
     */
    public Hat(Character character) {
        super(character);
        this.character = character;
        integrateDecor(FileReader.getLines("txt/hat.txt"));
    }
}
