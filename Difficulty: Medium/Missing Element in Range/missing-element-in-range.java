class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Arrays.sort(arr);
        int num=low;
        int i=0;
           while(num<=high){
               if(i<arr.length && arr[i]==num){
                   i++;
                   num++;
               }
              else if(i<arr.length && arr[i]<num){
                   i++;
               }
               else if(i<arr.length && arr[i]>num){
                   result.add(num);
                   num++;
               }
               else{
                    result.add(num);
                   num++;
               }
           }
        return result;
    }
}