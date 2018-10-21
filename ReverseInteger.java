class Solution {
    public int reverse(int x) {
        final String numberStr = "" + x;
        String resultStr = "";
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            if (numberStr.charAt(i) != '-') {
                resultStr += numberStr.charAt(i);    
            }
        }
    
        long result = Long.valueOf(resultStr);
        if (Integer.MAX_VALUE < result) {
            return 0;
        }
        
        return (int) (x < 0 ? result * -1 : result);
    }
}
