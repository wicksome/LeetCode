class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x / 10 == 0) return true;
        if (x > 10 && (x % 10) == 0) return false;
        
        int idx = 0;
        int temp = x;
        
        while (temp > 0) {
            temp /= 10;
            idx++;
        }
        
        int right = idx - 1;
        int leftValue = x;
        int rightValue = x;
        
        for (int left = 0; left < idx / 2; left++) {
            int l = leftValue % 10;
            leftValue /= 10;

            int offset = powOfTen(right--);
            int r = rightValue / offset;
            rightValue %= offset;
            
            if (r != l) {
                return false;
            }
        }
        
        return true;
    }
    
    private int powOfTen(int x) {
        return (x > 1) ? 10 * powOfTen(x - 1) : 10;
    }
}
