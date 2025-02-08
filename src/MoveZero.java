import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] num = {73,2,0,0,0,0,0};

        int l = 0;
        int r = 0;

        if (num.length == 1) {
            return;
        }

        while(r< num.length && l< num.length) {
            if (num[r]==0) {
                r++;
                continue;
            }
            if (num[l]!=0) {
                l++;
                continue;
            }
            if (l>r) {
                r++;
                continue;
            }
            if (num[l]==0 && num[r]!=0) {
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r++;
            }
        }

        System.out.println(Arrays.toString(num));
    }
}
