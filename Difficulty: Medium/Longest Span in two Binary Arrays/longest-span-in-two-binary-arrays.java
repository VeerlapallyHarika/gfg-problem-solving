class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        int n = a1.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = a1[i] - a2[i];
        }
        int prefix = 0, maxLen = 0;
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < n; i++) {
            prefix += diff[i];
            if (prefix == 0) {
                maxLen = i + 1;
            } else if (map.containsKey(prefix)) {
                maxLen = Math.max(maxLen, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }
        }
        return maxLen;
    }
}