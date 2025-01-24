import java.util.Arrays;
import java.util.HashMap;

public class DivideTeamEqualSize {

    private static void divideTeam(int[] arr, int n) {
        Arrays.sort(arr);
        int target = arr[0] + arr[n-1];
        HashMap<Integer, Integer> ansMap = new HashMap<>();
        int start = 0;
        int end  = n-1;
        Long ans = 0L;

        while (start < end) {

            if (arr[start] + arr[end] == target) {
                ansMap.put(start, arr[start] * arr[end]);
                start ++;
                end --;
            } else return;
        }

        for (int i: ansMap.keySet()) {
            ans = ans + ansMap.get(i);
        }
        System.out.println("ans is " + ans);
     }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2};
        int n = arr.length;

        divideTeam(arr, n);
    }
}
