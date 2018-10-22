class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x / 10 == 0) return true;
        if (x > 10 && (x % 10) == 0) return false;
        
        final int origin = x;
        int reversed = 0;
        
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        return origin == reversed;
    }
}
