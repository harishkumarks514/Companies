package mergeIntervals;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            int[] curr = intervals[i];

            // overlap condition
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                result.add(prev);
                prev = curr;
            }
        }

        result.add(prev);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        int[][] res = merge(intervals);

        for (int[] interval : res) {
            System.out.println(Arrays.toString(interval));
        }
    }
}