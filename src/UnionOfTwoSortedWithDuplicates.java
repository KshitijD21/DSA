import java.util.*;

public class UnionOfTwoSortedWithDuplicates {

    public static void main(String[] args) {

        int[] a = {-3, 8, 5, -2};
        int[] b = {-5, -1};

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i=0; i<a.length; i++) {
            map.put(a[i],i);
        }
        for(int i=0; i<b.length; i++) {
            map.put(b[i],i);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            newArr.add(entry.getKey());
        }

        Collections.sort(newArr);
        System.out.println(newArr.toString());

    }
}
