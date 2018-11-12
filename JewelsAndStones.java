class Solution {
    public int numJewelsInStones(String J, String S) {
       	HashMap<Character, Integer> pocket = new HashMap<>(S.length());
		for (char jewel : S.toCharArray()) {
			pocket.put(jewel, (pocket.getOrDefault(jewel, 0)) + 1);
		}

		int sum = 0;
		for (char jewel : J.toCharArray()) {
			sum += pocket.getOrDefault(jewel, 0);
		}
        return sum;
    }
}
