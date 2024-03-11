public class Main {
    public static void main(String[] args) {
        String filePath = "input.txt";
        String text = FileProcessor.readFile(filePath);

        WordCounter wordCounter = new WordCounterImpl();
        int wordCount = wordCounter.countWords(text);
        System.out.println("Number of words: " + wordCount);

        String longestWord = wordCounter.findLongestWord(text);
        System.out.println("Longest word: " + longestWord);

        int[] wordCounts = wordCounter.countWordOccurrences(text);
        System.out.println("Word occurrences:");
        for (int i = 0; i < wordCounts.length; i++) {
            System.out.println((i + 1) + ". word: " + wordCounts[i]);
        }
    }
}
