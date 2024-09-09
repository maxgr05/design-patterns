/* Written by Max Granger */

public class PotatoeHead extends Character {
    
    public PotatoeHead(String name) {
        super(FileReader.getLines("txt/potatoe-head.txt"), name);
        System.out.println(FileReader.getLines("txt/potatoe-head.txt"));
    }
}
