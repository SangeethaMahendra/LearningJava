package InterviewProgramsBySuresh;

import java.io.*;

class Player{
    Player(){
        System.out.println("p");
    }
}
public class CardPlayer extends Player implements Serializable {
    CardPlayer() {
        System.out.println("c");
    }

    public static void main(String[] args) {
        CardPlayer c1 = new CardPlayer();
        try {
            FileOutputStream fos = new FileOutputStream(" play.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(c1);
            os.close();

            FileInputStream fis = new FileInputStream("play.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            CardPlayer c2 = (CardPlayer) is.readObject();
            is.close();

        } catch (Exception e) {
        }
                //output p c
    }
}
