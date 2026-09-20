class Solution {
    int floorSqrt(int n) {
        // code here
        int low=1, high=n;
        while(low<=high){
            int mid=(low+high)/2;
            int value=mid*mid;
            if(value<=n){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        
        }
           return high;     
    }
}