import java.util.HashMap;

class Solution {
    private static void gcdOfStrings(String str1, String str2) {

        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < Math.min(str1.length(), str2.length())  ; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                map.put(str1.charAt(i) , 1);
            }
        }

        for (Character i : map.keySet()) {
            ans.append(i);
        }

        System.out.println(ans.toString());

    }

    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";


         gcdOfStrings(str1, str2);
    }
}