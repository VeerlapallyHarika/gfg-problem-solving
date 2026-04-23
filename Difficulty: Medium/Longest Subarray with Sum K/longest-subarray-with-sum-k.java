// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int Maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                Maxlen=Math.max(Maxlen,i+1);
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                Maxlen=Math.max(Maxlen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return Maxlen;
    }
}
