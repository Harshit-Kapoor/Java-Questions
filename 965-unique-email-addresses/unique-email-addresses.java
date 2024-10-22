class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i=0; i<emails.length; i++) {
            
            String email = emails[i];
            
            String newEmail = "";
            
            for (int j=0; j<email.indexOf('@'); j++) {
                
                if (email.charAt(j) != '.') {
                    if (email.charAt(j) == '+') {
                        break;
                    }
                    newEmail += email.charAt(j);
                }
                
            }
            
            newEmail += email.substring(email.indexOf('@'));
            
            System.out.println(newEmail);
            
            map.put(newEmail, map.getOrDefault(newEmail, 0) + 1);
            
        }
        
        return map.size();
        
    }
}