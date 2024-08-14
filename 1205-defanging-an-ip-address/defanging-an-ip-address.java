class Solution {
    public String defangIPaddr(String address) {
  
        String sb = "";
        
        char[] ch = address.toCharArray();
        
        for (int i=0; i<ch.length; i++) {
            
            if (ch[i] == '.') {
                sb += "[.]";
            } else {
                sb += address.charAt(i);
            }
            
        }
        
        return sb.toString();
        
        
//        return address.replace(".", "[.]");
        
    }
}