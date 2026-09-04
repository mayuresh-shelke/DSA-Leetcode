class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            int start = i;
            int end = s.length-i-1;

            char startchar = s[start];
            char endchar = s[end];

            s[end] = startchar;
            s[start] = endchar;
        }
    }
}