import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int array[] = new int[2];

        for (int i = 0; i < nums.length ; i++) {
            int find = target - nums[i];
            boolean ans = map.containsKey(find);
            if (ans) {
                array[0] = map.get(find);;
                array[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        for (int index : array) {
            System.out.println("Index: " + index);
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        twoSum(nums, target);
    }
}
