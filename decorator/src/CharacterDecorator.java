/* Written by Max Granger */
import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {
    private Character character;

    /**
     * @param character the character being decorated
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
        this.character = character;
    }

    /**
     * @param decor new feature to be added
     */
    protected void integrateDecor(ArrayList<String> decor) {
        if (decor == null) {
            return;
        }
        ArrayList<String> lines = character.getLines();
        for(int i = 0; i < lines.size(); i++) {
            //sets lines to char arrays
            char[] charA = new char[lines.get(i).length()];
            char[] charB = new char[decor.get(i).length()];
            lines.get(i).getChars(0, lines.get(i).length(), charA, 0);
            decor.get(i).getChars(0, decor.get(i).length(), charB, 0);
            if (charB.length > 0) {
                if (charA.length < charB.length) { //if A is smaller, use B
                    for (int j = 0; j < charA.length; j++) {
                        char cA = charA[j];
                        char cB = charB[j];
                        if (cB == ' ' && !(cA == ' ')) { 
                            charB[j] = charA[j];
                        }
                    }
                    String nA = new String(charB);
                    lines.set(i, nA);
                } else {  //if B is smaller. use A
                    for (int j = 0; j < charB.length; j++) {
                        char cA = charA[j];
                        char cB = charB[j];
                        if (cA == ' ' && !(cB == ' ')) {
                            charA[j] = charB[j];
                        }
                    }
                    String nA = new String(charA);
                    lines.set(i, nA);
                }
            }
            
        }
        character.setLines(lines);
    }
}
