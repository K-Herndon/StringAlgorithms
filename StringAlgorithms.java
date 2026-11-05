public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        int numLetters = word.length();
        int letterNum = 0;
        String newString = "";
        while (numLetters > 0){
           newString = newString + word.substring(letterNum, letterNum + 1) + "\n";
           letterNum++;
           numLetters--;
        }
        return newString;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        int numLetters = word.length();
        int letterNum = word.length() - 1;
        String newString = "";
        while (numLetters > 0){
           newString = newString + word.substring(letterNum, letterNum+1);
           letterNum--;
           numLetters--;
        }
        return newString;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        String newSentence = "" + Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1, sentence.length());
        for (int i = 0; i < sentence.length(); i++)
        {
           char checking = newSentence.charAt(i);
           if (checking == ' '){
            newSentence = newSentence.substring(0, i+1) + Character.toUpperCase(sentence.charAt(i+1)) + sentence.substring(i+2, sentence.length());
           }
        }
        return newSentence;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        String reverse = reverseWord(word);
        return reverse.equals(word);
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static String firstUniqueChar(String word) {
        // TODO: Implement this method
        String charToCheck = "";
        int checkIndex = 0;
        boolean found = false;
        while (found == false){
        // grab next character in the string
           charToCheck = word.substring(checkIndex, checkIndex+1);
        // grab the string AFTER the character
           String portionBeforeToCheck = word.substring(checkIndex + 1, word.length());
        // grab the string BEFORE the character
           String portionBehindToCheck = word.substring(0, checkIndex);
        // check if character being checked appears in the strings before or after where it is being checked
           if (portionBeforeToCheck.indexOf(charToCheck) == -1 && portionBehindToCheck.indexOf(charToCheck) == -1){
              found = true;
           } else {
            checkIndex++;
           }
        }
        return charToCheck;
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
        System.out.println(printCharacters("hello"));

        System.out.println("Testing reverseWord:");
        // Example:
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        System.out.println(firstUniqueChar("swiss"));
    }
}