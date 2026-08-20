class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int xor=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            int x=xor^k;
            count += map.getOrDefault(x, 0);
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}