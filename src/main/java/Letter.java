import java.util.HashMap;
import java.util.Map;

public class Letter {

    private String letter;
    private int number;



    public Letter() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Letter(String letter, int number) {
        this.letter = letter;
        this.number = number;
    }
}
