import java.util.*;

public class LetterFrequency {

    private ArrayList<Letter> letterList;

    public LetterFrequency() {
        this.letterList = new ArrayList<>();
    }

    public void getLettersLogic(String word) {
        String output = "";
        ArrayList<Letter> letterFrequency = new ArrayList<>();

        ArrayList<String> wordWithoutSpaceArray = new ArrayList<>(Arrays.asList(word.replaceAll("\\s", "").split((""))));

        System.out.println("The number of characters in the sentence is: " + wordWithoutSpaceArray.size());

        for (int i = 0; i < wordWithoutSpaceArray.size(); i++) {
            String currentLetter = wordWithoutSpaceArray.get(i);
            Letter targetLetter = letterFrequency.stream().filter(letter -> letter.getLetter().equals(currentLetter)).findFirst().orElse(null);

            if (targetLetter != null) {
                Letter targetLetterObject = letterFrequency.get(letterFrequency.indexOf(targetLetter));
                letterFrequency.set(letterFrequency.indexOf(targetLetter), new Letter(targetLetterObject.getLetter(), targetLetterObject.getNumber() + 1));
            } else {
                letterFrequency.add(new Letter(currentLetter, 1));
            }
        }

        letterFrequency.sort(Comparator.comparing(Letter::getNumber).reversed());

        int loopLength = 10;

        if (letterFrequency.size() < 10) {
            loopLength = letterFrequency.size();
        }

        for (int i = 0; i < loopLength; i++) {
            System.out.println(letterFrequency.get(i).getLetter() + "  (" + letterFrequency.get(i).getNumber() + ")");
        }
    }

    public void getLetters(String word) {
        getLettersLogic(word);
    }

    public void getLetters(String word, boolean caseSensitive) {
        if (caseSensitive) {
            getLettersLogic(word);
        } else {
            getLettersLogic(word.toLowerCase());
        }
    }
}
