import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {

        int[][] intervals = {
                {1,4},
                {0,0}
        };

        interval(intervals);
    }

    public static void interval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        System.out.println(Arrays.deepToString(intervals));
        System.out.println("Sorted intervals:");
        int min = -1;
        int max = -1;
        System.out.println(intervals.length);
        int row = 0;
        int put = 0;
//        int[][] newArr = new int[intervals.length][2];

        List<int[]> newArr = new ArrayList<int[]>();

        while(row<intervals.length) {
            if (min == -1 && max == -1) {
                min = intervals[row][0];
                max = intervals[row][1];
            } else {
                if (max >= intervals[row][0]){
                    if (max < intervals[row][1]){
                        max = intervals[row][1];
                    }
                } else {
//                    newArr[put][0] = min;
//                    newArr[put][1] = max;
                    newArr.add(new int[] {min, max});
                    min = intervals[row][0];
                    max = intervals[row][1];
                    put++;
                }
            }

            if (row == intervals.length-1) {
                newArr.add(new int[] {min, max});
            }

            row++;
        }

        int[][] result = newArr.toArray(new int[newArr.size()][]);

        System.out.println(Arrays.deepToString(result));

    }
}
