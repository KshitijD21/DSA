import java.util.Arrays;

public class MissingNumber {

    private static void  swapNumbers(int[] arr, int first, int second) {
        int swap= arr[first];
        arr[first] = arr[second];
        arr[second] = swap;
    }

    public static void main(String[] args) {

        int[] nums = {3,0,1};
        int n = nums.length;
        int i = 0;
        int ans = 0;

        while (i < n) {
            int correct = nums[i];
            if (nums[i] != nums[correct] && nums[i] < nums.length - 1) {
                swapNumbers(nums, i, correct );
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                ans = j;
            }
        }

        System.out.println("ans " + ans);
    }
}
