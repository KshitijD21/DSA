import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {


    public static void main(String[] args) {
        String s = "abcabcbb";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0 ; i < s.length() ; i++) {
            if (i == 0 ) {
                map.put(s.charAt(i), i);
            }
            if (i > 0 && (s.charAt(i) != s.charAt(i-1))) {
                map.put(s.charAt(i), i);
            } else {
                map.clear();
            }
        }

        System.out.println(map.size());
    }
}
