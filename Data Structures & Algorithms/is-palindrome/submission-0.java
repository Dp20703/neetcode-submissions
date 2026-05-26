
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = s.length();

        char[] ch = s.toCharArray();
        char[] rev = new char[n];

        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            rev[count++] = ch[i];
        }

        return Arrays.equals(ch, rev);
    }
}