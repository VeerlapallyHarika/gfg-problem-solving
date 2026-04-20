class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (i < n && j < m) {
        
            if (!result.isEmpty() && result.get(result.size() - 1) == Math.min(a[i], b[j])) {
                if (a[i] < b[j]) i++;
                else if (a[i] > b[j]) j++;
                else {
                    i++;
                    j++;
                }
                continue;
            }

            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
}