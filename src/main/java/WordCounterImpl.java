import java.util.HashMap;
import java.util.Map;

public class WordCounterImpl implements WordCounter {
    @Override
    public int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("\\s+").length;
    }

    @Override
    public String findLongestWord(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split("\\s+");
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    @Override
    public int[] countWordOccurrences(String text) {
        if (text == null || text.isEmpty()) {
            return new int[0];
        }
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        int[] wordCounts = new int[wordCountMap.size()];
        int i = 0;
        for (int count : wordCountMap.values()) {
            wordCounts[i++] = count;
        }
        return wordCounts;
    }
}