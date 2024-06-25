class Solution {
    public int totalFruit(int[] arr) {
        
        // problem similar as sliding window -> max subarray/substring with k unique char, k is 2 here
        
        if (arr.length == 1 || arr.length == 2) {
            return arr.length;
        }
        
        int i = 0;
        int j = 0;
        int k = 2;
        int n = arr.length;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        while (j < n) {
            
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            
            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                max = Math.max(max, j-i+1);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
                    if (map.get(arr[i]) == 0) {
                        map.remove(arr[i]);
                    }
                    i++;
                }
                j++;
            }
            
            
        }
        
        if(map.size() == 1) {
            max = arr.length;
        }
        
        return max;
        
    }
}