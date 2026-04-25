class Solution {
    int majorityElement(int arr[]) {
        // code here
        int count=0, number=0;
        for(int n:arr){
            if(count==0){
                number=n;
            }
            if(n==number){
                count++;
            }
            else{
                count--;
            }
        }
        int freq=0;
        for(int n:arr){
            if(n==number){
                freq++;
            }
        }
        if(freq>arr.length/2){
            return number;
        }
        return -1;
    }
}