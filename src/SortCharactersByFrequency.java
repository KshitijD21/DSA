import java.util.HashMap;

public class SortCharactersByFrequency {


    private static void sortCharactersByFrequency(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character value = s.charAt(i);

            if (map.containsKey(value)) {
                map.put(value, map.get(value).intValue() + 1 );
            } else {
                map.put(value, 1);
            }
        }

        for (Character value : map.keySet()) {
            System.out.println("value " + value  + " key " + map.get(value).intValue());
        }

    }

    public static void main(String[] args) {
        String s = "tree";
        sortCharactersByFrequency(s);
    }
}
