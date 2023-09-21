//Muhammad Khizar Irfan      0248-bscs-22

import java.util.ArrayList;
import java.util.Arrays;

public class SpellChecker {

    private ArrayList<String> dictionary;

    public SpellChecker(String dictionaryFileName) {
        DictReader dictReader = new DictReader(dictionaryFileName);
        dictionary = dictReader.getDictionary();
    }
    //base task 1
    //--------------------------------------------------------
    public int numberOfWords() { // Returns the number of words in the dictionary
        return dictionary.size();
    }

    public boolean isKnownWord(String word) {
        return dictionary.contains(word);
    }

    public boolean allKnown(ArrayList<String> words) {
        return dictionary.containsAll(words);
    }
    //--------------------------------------------------------
    //base task 2
    //--------------------------------------------------------

    public ArrayList<String> wordsStartingWith(String prefix) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                result.add(word);
            }
        }
        return result;
    }

    public ArrayList<String> wordsContaining(String text) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (word.toLowerCase().contains(text.toLowerCase())) {
                result.add(word);
            }
        }
        return result;
    }
    //--------------------------------------------------------
    //base task 3
    //--------------------------------------------------------


    public void insert(String newWord) {
        if (!isKnownWord(newWord)) {
            int index = 0;
            while (index < dictionary.size() && newWord.compareToIgnoreCase(dictionary.get(index)) > 0) {
                index++;
            }
            dictionary.add(index, newWord);
        }
    }

    public boolean remove(String word) {
        String lowerCaseWord = word.toLowerCase();
        return dictionary.remove(lowerCaseWord);
    }

    public void save() {  // From DictReader class.
        DictReader dictReader = new DictReader("D:\\abcd\\words.txt");
        dictReader.save(dictionary);
    }
    //--------------------------------------------------------
    //challenge tasks
    //--------------------------------------------------------

    public boolean isPalindrome(String word) {
        String lowerCaseWord = word.toLowerCase();
        return isKnownWord(lowerCaseWord) && lowerCaseWord.equals(new StringBuilder(lowerCaseWord).reverse().toString());
    }

    public ArrayList<String> anagrams(String word) {
        ArrayList<String> result = new ArrayList<>();
        String lowerCaseWord = word.toLowerCase();
        char[] wordChars = lowerCaseWord.toCharArray();
        Arrays.sort(wordChars);

        for (String dictWord : dictionary) {
            if (!lowerCaseWord.equals(dictWord)) {
                char[] dictWordChars = dictWord.toLowerCase().toCharArray();
                Arrays.sort(dictWordChars);
                if (Arrays.equals(wordChars, dictWordChars)) {
                    result.add(dictWord);
                }
            }
        }

        return result;
    }

    public ArrayList<String> difference(ArrayList<String> otherDictionary) { // Not Mandatory.
        ArrayList<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (!otherDictionary.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }
    //--------------------------------------------------------


    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker("D:\\abcd\\words.txt");
        //base task 1
        //--------------------------------------------------------
        System.out.println("--------------------------");
        System.out.println("base task 1");
        System.out.println("Number of words in the dictionary: " + spellChecker.numberOfWords());

        System.out.println("Checking if the word is valid >> " + spellChecker.isKnownWord("sugar"));

        ArrayList<String> testWords = new ArrayList<>();
        testWords.add("car");
        testWords.add("tree");
        testWords.add("shy");
        System.out.println("Are all test words known? >> " + spellChecker.allKnown(testWords));
        System.out.println("--------------------------");
        //--------------------------------------------------------
        //base task 2
        //--------------------------------------------------------
        System.out.println("base task 2");
        ArrayList<String> wordsStartingWithPrefix = spellChecker.wordsStartingWith("abe");
        System.out.println( wordsStartingWithPrefix.size() + " words start with this");
        System.out.println(wordsStartingWithPrefix);


        String text = "photo";
        ArrayList<String> wordsContainingText = spellChecker.wordsContaining(text);
        System.out.println(wordsContainingText.size() + " words contain this text");

        System.out.println("--------------------------");
        //--------------------------------------------------------
        //base task 3
        System.out.println("base task 3");
        spellChecker.insert("aan");
        spellChecker.save();

        boolean removed = spellChecker.remove("khizar");
        System.out.println("Removing word and checking if the output is True or False >> " + removed);
        spellChecker.save();
        System.out.println("--------------------------");
        //--------------------------------------------------------
        //challenge task
        //--------------------------------------------------------
        System.out.println("challenge task");
        System.out.println("palindrome? >> " + spellChecker.isPalindrome("racecar"));

        String input = "race";
        ArrayList<String> anagrams = spellChecker.anagrams(input);
        System.out.println("Input : \"" + input + "\"");
        System.out.println("Anagrams: " + anagrams);
        //base task 1
        //--------------------------------------------------------

    }
}



