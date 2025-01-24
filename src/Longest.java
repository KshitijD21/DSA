public class Longest {


    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String ans = "";

        for (int i = 0; i < nums.length; i++) {
            String currentNumStr = Integer.toString(nums[i]);

            if (i == 0) {
                ans = currentNumStr;
            } else {
                if ((ans + currentNumStr).compareTo(currentNumStr + ans) > 0) {
                    ans = ans + currentNumStr;
                } else {
                    ans = currentNumStr + ans;
                }
            }
        }
        System.out.println(ans);
    }
}
