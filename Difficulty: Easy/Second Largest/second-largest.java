class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secondlargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}