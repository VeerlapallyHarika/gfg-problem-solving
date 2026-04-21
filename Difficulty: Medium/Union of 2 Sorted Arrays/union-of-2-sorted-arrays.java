class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> temp = new TreeSet<>();

        for (int i : a) temp.add(i);
        for (int i : b) temp.add(i);

        ArrayList<Integer> result=new ArrayList<>();

        for (int n : temp) {
            result.add(n);
        }
        return result;
    }
}
