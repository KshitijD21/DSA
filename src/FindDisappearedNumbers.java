import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDisappearedNumbers {


    private static void findDisappearedNumber(int[] nums, int n) {

        List<Integer> ans = new ArrayList<>();
        int Array[] = new int[n];

       for (int i = 0 ; i < n ; i++ ) {
            Array[nums[i]] = nums[i];
       }


        for (int i = 0 ; i < n ; i++) {
           if (Array[i] == 0 ) {
               ans.add(i);
           }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Array[i]);
        }


    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumber(nums, nums.length);
    }
}
