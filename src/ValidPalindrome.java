public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "race a car";
        String regex1 = "[^a-zA-Z]";
        String filteredString = s.replaceAll(regex1, "");
        String newString = filteredString.toLowerCase();
        int l = 0;
        int r = newString.length() - 1;

        System.out.println(newString);

        if(newString.isEmpty()) {
            System.out.println("true");
        }
//        checkIsPalindrome(newString, l, r);
//
//        System.out.println(result);

    }

    public static void checkIsPalindrome(String s1, int l, int r, int length, boolean result) {
        if (l>=r) {
            System.out.println("true");
            return;
        }
        if(s1.charAt(l) != s1.charAt(r)) {
            result = false;
        }
        checkIsPalindrome(s1, ++l, --r, length, result);
    }
}
