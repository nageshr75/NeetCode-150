class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int i = 0;
        int j = cleaned.length() - 1;
        
        // Two-pointer approach to check for palindrome
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) {
                return false; // Characters mismatch
            }
            i++;
            j--;
        }
        return true; // Characters matched
    }
}
