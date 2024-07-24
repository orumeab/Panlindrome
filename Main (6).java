public class Main {
    public static void main(String[] args) {

        String[] words = {"test", "dog", "madam", "boy", "radar"};

        for (String word : words) {
            char[] wordArray = word.toCharArray();

            boolean checkPalindrome = true;
            for (int i = 0; i < wordArray.length / 2; i++) {
                if (wordArray[i] != wordArray[wordArray.length - 1 - i]) {
                    checkPalindrome = false;
                    break;
                }
            }

            if (checkPalindrome) {
                System.out.println("The word " + word + " is a palindrome");
            } else {
                System.out.println("The word " + word + " is not a palindrome");
            }
        }
    }
}
