import java.util.HashMap;

public class Itinerary {

    private static String getStart(HashMap<String, String> tick) {

        HashMap<String , String> revMap = new HashMap<>();
        String start = "";

        for (String key: tick.keySet()) {
            revMap.put(tick.get(key), key);
        }

        for (String key: tick.keySet()) {
            if (!revMap.containsKey(key)){
                start = key;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        String value = start;

        while (tickets.containsKey(value)) {
            System.out.print(value + "->");
            value = tickets.get(value);
        }

        System.out.println(value);
    }

}
