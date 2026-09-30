class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1; // -1 matlab stack khaali

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;          // opening bracket push
            } else {
                if (top == -1) return false; // close aaya par open hai hi nahi

                char open = stack[top--];    // last open bracket pop
                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;            // type match nahi hua
                }
            }
        }
        return top == -1; // end me stack khaali hona chahiye
    }
}