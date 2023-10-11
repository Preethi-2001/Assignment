public class Main {
    public static void main(String[] args) {
        String testSentence = "Two driven jocks help fax my big quiz";
        // String testSentence = "What a lovely day";
        
        boolean isPangram = isPangram(testSentence);
        
        if (isPangram) {
            System.out.println(testSentence + " is a pangram.");
        } else {
            System.out.println(testSentence + " is not a pangram.");
        }
    }
    
    public static boolean isPangram(String testSentence) {
        
        boolean[] alphabet = new boolean[26];
        testSentence = testSentence.toLowerCase();
        for (char c : testSentence.toCharArray()) {
            
            if ('a' <= c && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}
