class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int rev = 26 - (ch - 'a');   // 'a' -> 26, 'z' -> 1
            sum += rev * (i + 1);        
        }
        return sum;
    }
}