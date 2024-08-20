class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        int hr1 = Integer.parseInt(event1[0].substring(0, 2));
        int hr2 = Integer.parseInt(event1[1].substring(0, 2));
        int hr3 = Integer.parseInt(event2[0].substring(0, 2));
        int hr4 = Integer.parseInt(event2[1].substring(0, 2));
        
        int min1 = Integer.parseInt(event1[0].substring(3));
        int min2 = Integer.parseInt(event1[1].substring(3));
        int min3 = Integer.parseInt(event2[0].substring(3));
        int min4 = Integer.parseInt(event2[1].substring(3));
        
        int t1 = (hr1 * 60) + min1;
        int t2 = (hr2 * 60) + min2;
        int t3 = (hr3 * 60) + min3;
        int t4 = (hr4 * 60) + min4;
        
        if ((t3 >= t1 && t3 <= t2) || (t1 >= t3 && t1 <= t4)) {
            return true;
        }
        
        return false;
        
    }
}