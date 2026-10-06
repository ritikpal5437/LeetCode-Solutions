class Solution {
    public int minAddToMakeValid(String s) {
        int openbracket = 0;
        int minAddRequired = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openbracket++;
            } else {
                if (openbracket > 0) {
                    openbracket--;
                } else {
                    minAddRequired++;
                }
            }
        }
       return minAddRequired + openbracket;
    }
}