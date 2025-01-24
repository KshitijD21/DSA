import java.util.ArrayList;
import java.util.HashMap;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = {7,3,9};
        int[] nums2 = {6,3,9,2,9,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])){
                map.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!map.containsKey(nums2[i])) {
                map.put(nums2[i], 1);
            }
        }

        System.out.println("unique values are:: " + map.size());

        }
}
