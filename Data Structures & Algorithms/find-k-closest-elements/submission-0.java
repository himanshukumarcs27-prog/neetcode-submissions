
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int n = arr.length;

        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices based on distance
        Arrays.sort(indices, (a, b) -> {
            int diffA = Math.abs(arr[a] - x);
            int diffB = Math.abs(arr[b] - x);

            if (diffA != diffB) {
                return Integer.compare(diffA, diffB);
            }

            return Integer.compare(arr[a], arr[b]);
        });

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(arr[indices[i]]);
        }

        Collections.sort(result);

        return result;
    }

}