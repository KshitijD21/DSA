import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Uncommon {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");


        ArrayList<String> allWords = new ArrayList<>(Arrays.asList(words1));
        allWords.addAll(Arrays.asList(words2));

        ArrayList<String> arr =  new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0 ; i < allWords.size(); i ++) {
            if (map.containsKey(allWords.get(i))) {
                map.put(allWords.get(i), map.get(allWords.get(i)) + 1 );
            } else  {
                map.put(allWords.get(i), 1 );
            }
        }

        for (String key: map.keySet()) {
            if (map.get(key) == 1) {
                arr.add(key);
            }
        }

        String[] uniqueWordsArray = new String[arr.size()];
        arr.toArray(uniqueWordsArray);



    }
}
