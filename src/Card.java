import java.io.File;

public class Card {

    int value;
    String type;
    File card;

    public Card(int v, String t, File c){

        value = v;
        type = t;
        card = c;

    }

    public int getValue(){
        return value;
    }
    public String getType(){
        return type;
    }

    public File getCardImage(){
        return card;
    }

}
