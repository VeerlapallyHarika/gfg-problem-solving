class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int floor=findFloor(arr,x);
        int ceil=findCeil(arr,x);
        return new int[]{floor,ceil};
    }
     static int findFloor(int[] arr, int x) {
        // code here
               int low=0,high=arr.length-1;
               int ans=-1;
               while(low<=high){
                   int mid=low+(high-low)/2;
                   if(arr[mid]<=x){
                       ans=arr[mid];
                       low=mid+1;
                   }
                   else{
                        high=mid-1;
                   }
               }
               return ans;
     }
        static int findCeil(int[] arr, int x) {
         // code here
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
}
}
