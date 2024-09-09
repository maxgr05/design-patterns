/* Written by Max Granger */

import java.util.ArrayList;

public abstract class Character {
    private String name;
    protected ArrayList<String> lines;

    /**
     * @param lines the ASCII character lines
     * @param name name of the guy
     */
    public Character(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    /**
     * @return name of the guy
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the ASCII character lines
     */
    public ArrayList<String> getLines() {
        return this.lines;
    }

    /**
     * @param lines sets lines to edited lines
     */
    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * @return his name + the string representation with proper formatting
     */
    public String toString() {
        String newLines = new String("");
        for (String l : lines) {
            newLines = newLines + l + "\n";
        }
        return this.name + "\n" + newLines;
    }
}
