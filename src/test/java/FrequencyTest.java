import org.junit.Test;

public class FrequencyTest {

    LetterFrequency letterFrequency;

    @Test
    public void check(){
        letterFrequency = new LetterFrequency();
        String test = "This is" +
                "ert";
        letterFrequency.getLetters(test, false);
    }

}
