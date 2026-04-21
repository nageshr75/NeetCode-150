class Solution {
    public boolean isAnagram(String s, String t) {
        //sort both the strings 
        //compare both the strings

        char[] charArray1 = s.toCharArray();
        Arrays.sort(charArray1);
        String sorteds = new String(charArray1);

        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray2);
        String sortedt = new String(charArray2);
        Boolean isEqual = sorteds.equals(sortedt);
        return isEqual;

        
        
    }
}