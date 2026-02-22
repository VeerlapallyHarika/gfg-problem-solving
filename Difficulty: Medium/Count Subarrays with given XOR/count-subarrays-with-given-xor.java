import java.util.*;

class Solution {
    public long subarrayXor(int arr[], int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int xor = 0;
        long count = 0;
        
        for (int num : arr) {
            xor ^= num;
            if (xor == k) {
                count++;
            }
            int target = xor ^ k;
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }
            freq.put(xor, freq.getOrDefault(xor, 0) + 1);
        }
        
        return count;
    }
}