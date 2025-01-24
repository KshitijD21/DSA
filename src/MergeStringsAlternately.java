public class MergeStringsAlternately {


    private static void mergeString(String word1, String word2) {
        StringBuilder ans  = new StringBuilder();
        int max = 0;

        if (word1.length() > word2.length()) {
            max = word1.length();
        } else {
            max = word2.length();
        }


        for (int i = 0; i < max ; i++ ) {
            if (word1.length() > i) {
                ans.append(word1.charAt(i));
            }

            if (word2.length() > i) {
                ans.append(word2.charAt(i));
            }
        }


        System.out.println(" ans is " + ans);

    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        mergeString (word1, word2);
    }
}
