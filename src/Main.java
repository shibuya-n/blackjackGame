import java.io.File;
import java.util.ArrayList;

public class Main {

    ArrayList<Card> deck = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Hello world!"

        );
        loadDeck();
    }

    public static void loadDeck(){
        File folder = new File("src/PNG-cards-1.3");
        File[] listOfFiles = folder.listFiles();

        for(int i = 0; i < listOfFiles.length; i++){
            String fileName = listOfFiles[i].getName();
            System.out.println(fileName);
        }

        for (File file : listOfFiles){
            if (file.isFile()){
                String fileName = file.getName();

                System.out.println(parseStringForValue(fileName));
            }
        }

    }

    public static int parseStringForValue(String someCard){
        int toReturn = 0;
        for (int i = 0; i < someCard.length(); i++){
            if(someCard.substring(i, i+1).equals("_")){
                String cardValue = someCard.substring(0, i);
                try{
                    toReturn = Integer.parseInt(cardValue);
                }
                catch (Exception e){
                    if (cardValue.equals("ace")){

                    }
                    else if (cardValue.equals("jack")){

                    }
                    else if (cardValue.equals("queen")){

                    }
                    else {

                    }
                }

                break;
            }
        }
        return toReturn;
    }

    public static String parseStringForType(String someCard){
        String toReturn = "";
        for (int i = someCard.length() - 1; i >= 0 ; i--){
            if(someCard.substring(i, i+1).equals("_")){
                toReturn = someCard.substring(i-1);
            }
        }
        return toReturn;

    }
}