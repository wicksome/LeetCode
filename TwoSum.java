class Solution {
    public int[] twoSum(int[] nums, int target) {
        final int[] result = new int[2];
        firstLoop: for (int first = 0; first < nums.length; first++) {
            secondLoop: for (int second = first + 1; second < nums.length; second++) {
                if (first == second) {
                    continue secondLoop;
                }
                if (nums[first] + nums[second] == target) {
                    result[0] = first;
                    result[1] = second;
                    break firstLoop;
                }
            }
        }
        
        return result;
    }
}
