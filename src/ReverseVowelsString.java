public class ReverseVowelsString {

    public static void main(String[] args) {
        String s1 = "Euston saw I was not Sue.";
        char[] charArray = s1.toCharArray();

        int left = 0;
        int right = charArray.length-1;

        while (left < right) {
            if (isVowel(charArray[left]) && isVowel(charArray[right])) {
                swap(charArray, left, right);
                left++;
                right--;
                continue;
            }

            if (isVowel(charArray[left]) && !isVowel(charArray[right])) {
                right --;
            } else {
                left ++;
            }
        }

        System.out.println(new String(charArray));
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    private static void swap (char[] charArray, int left, int right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
    }
}
