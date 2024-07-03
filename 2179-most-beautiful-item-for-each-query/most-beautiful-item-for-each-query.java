class Solution {
        public static int[] maximumBeauty(int[][] items, int[] q) {

        Arrays.sort(items, new Comparator<int[]>(){
            @Override
            public int compare(int[] e1, int[] e2){
                if(e1[1]> e2[1]){
                    return -1;
                }
                else if(e1[1] == e2[1]){
                    return 0;
                }
                return 1;
            }
        });

//        for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items[0].length; j++) {
//                System.out.print(items[i][j] + ", ");
//            }
//            System.out.println();
//        }
//        System.out.println("****************");
//
         int[] ans = new int[q.length];
//
//        Arrays.sort(items, (a, b) -> b[1] - a[1]);
//
//        for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items[0].length; j++) {
//                System.out.print(items[i][j] + ", ");
//            }
//            System.out.println();
//        }
//        System.out.println("****************");

//        int max = items[1][0];
//
//        for (int i = 0; i < items.length; i++) {
//            max = Math.max(max, items[i][1]);
//            items[i][1] = (i == 0) ? items[i][1] : Math.max(max, items[i][1]);
//        }
//
//        for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items[0].length; j++) {
//                System.out.print(items[i][j] + ", ");
//            }
//            System.out.println();
//        }
//        System.out.println("****************");


        for (int i = 0; i < q.length; i++) {
            int j = 0;
            while (j < items.length && items[j][0] > q[i]) {
                j++;
            }
            if (j == items.length) {
                ans[i] = 0;
            } else {
                ans[i] = items[j][1];
            }
        }

        return ans;
    }
}