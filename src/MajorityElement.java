import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int nums[] = {2,2,1,1,1,2,2};

        for (int i=0; i< nums.length; i++){
            int key = nums[i];
            boolean value = map.containsKey(key);

            if (value) {
                int val = map.get(key);
                map.put(key, val +1);
            } else {
                map.put(key, 1);
            }
        }

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key).intValue());
        }
    }
}
