public class CombinationSumIII{
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        findCombinations(1, k, n, new ArrayList<Integer>());
        return ans;
    }

    public void findCombinations(int start, int k, int n, ArrayList<Integer> res) {
        if (n == 0 && k == 0) {
            ans.add(new ArrayList<>(res));
            return;
        }

        for (int i = start; i <= 9; i++) {
            res.add(i);
            findCombinations(i + 1, k - 1, n - i, res);
            res.remove(res.size() - 1);
        }
    }
}