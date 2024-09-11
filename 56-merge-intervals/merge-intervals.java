class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[0].length; j++) {
                System.out.print(intervals[i][j] + ", ");
            }
            System.out.println();
        }

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];

        result.add(intervals[0]);

        for (int[] interval : intervals) {

            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else{
                newInterval = interval;
                result.add(newInterval);
            }


        }

        return result.toArray(new int[result.size()][]);

    }

}