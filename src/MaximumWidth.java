public class MaximumWidth {



    private  static void maxWidth (int[] nums, int n) {
        int [] newNums = new int[n];
        int ans = 0;
        int temp = nums[n-1];
        newNums[n-1] = nums[n-1];
        int r = 0;

        // put values in newNums

        for (int i = n-2 ; i >= 0 ; i--) {
            if (nums[i] > newNums[i+1]) {
                temp = nums[i];
            }
            newNums[i] = temp;
        }
        for (int value : newNums) {
            System.out.println(value);
        }

        // then apply loop to identify which one is max width

        for (int i = 0; i< n ; i++ ){
            if (r <= i) {
               r = i +1;
            }
            while (r < n && nums[i] <= newNums[r]) {
                if (nums[i] <= newNums[r]) {
                    int value = r - i;

                    if (value > ans) {
                        ans = value;
                    }

                    r++;
                } else {
                    break;
                }
            }
            if (r == n-1) {
                break;
            }
        }


        System.out.println("ans " + ans);
    }

    public static void main(String[] args) {
        int[] nums = {6,0,8,2,1,5};
        int n = nums.length;

        maxWidth(nums, n);
    }
}
