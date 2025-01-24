import java.util.HashMap;

public class NonDecreasingArray {



    private static void nonDecreasingArray(int[] nums, int n) {

        int value = 0;

        for (int i = 0; i < n-1; i++) {
            if (nums[i] > nums[i+1]) {
                value += 1;

                if (value > 1 ) {
                    System.out.println("false");
                }

                if (nums[i-1] > nums[i+1]) {
                    nums[i+1] = nums[i];
                } else {
                    System.out.println("false");
                }
            }
        }

        System.out.println("true");

    }

    class Solution {

        public int[] findErrorNums(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int missing = -1;
            int duplicate = -1;


            for (int num : nums) {
                if (map.containsKey(num)) {
                    duplicate = num; // Found the duplicate
                }
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int i = 1; i <= nums.length; i++) {
                if (!map.containsKey(i)) {
                    missing = i; // Found the missing number
                    break;
                }
            }

            return new int[] {duplicate, missing};

        }
    }

    public static void main(String[] args) {
        int[] nums = {3,4,2,3};
        nonDecreasingArray(nums, nums.length);

    }
}
