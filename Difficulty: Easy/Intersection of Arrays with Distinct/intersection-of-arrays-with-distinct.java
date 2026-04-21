class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> res=new HashSet<>();
        for(int n:a){
            res.add(n);
        }
        int count=0;
        for(int n:b){
            if(res.contains(n)){
                count++;
            }
        }
        return count;
    }
}