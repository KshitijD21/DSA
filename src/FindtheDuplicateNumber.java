import java.util.HashMap;

public class FindtheDuplicateNumber {



    private static void  findtheDuplicateNumber(int[] nums, int n ) {

        for (int i = 0; i < n; i++) {
           int index= Math.abs(nums[i]) - 1;

           if (nums[index] < 0) {
               System.out.println(nums[i]);
           } else {
               nums[index] = - nums[index];
           }
        }
    }


    public static void main(String[] args) {

        int[] nums  = {3,1,3,4,2};
        findtheDuplicateNumber(nums, nums.length);

    }
}
