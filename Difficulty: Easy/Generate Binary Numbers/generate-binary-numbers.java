class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
         ArrayList<String> res=new ArrayList<>();
         if(n<0) return res;
         Queue<String> q = new LinkedList<>();
         q.add("1");
         for(int i=1;i<=n;i++){
             String f=q.poll();
             res.add(f);
             q.add(f+"0");
             q.add(f+"1");
         }
         return res;
    }
}
