class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        String result [] = new String[names.length];
        Map<Integer, String> map = new LinkedHashMap<Integer,String>();
        
        for(int i=0 ; i<heights.length; i++) {
        	
        	map.put(heights[i],names[i]);
        	
        }
        
        Arrays.sort(heights);
        
        for(int i=heights.length-1; i>=0; i--) {
        	
        	result[heights.length-i-1] = map.get(heights[i]);
        	
        }
        
		return result;
    }
}