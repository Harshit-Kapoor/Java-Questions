class Solution {
    public String defangIPaddr(String address) {
  
        StringBuilder sb = new StringBuilder();
        
        char[] ch = address.toCharArray();
        
        for (int i=0; i<ch.length; i++) {
            
            if (ch[i] == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
            
        }
        
        return sb.toString();
        
        
//        return address.replace(".", "[.]");
        
    }
}