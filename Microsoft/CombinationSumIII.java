public class CombinationSumIII{
    List<List<Integer>> ans;
    public void combinationSum3(int k, int num, int n, int number, ArrayList<Integer> seq) {
        if (num > k || number > n) {
            return;
        }

        if (n == 0) {
            ans.add(seq);
            return;
        }

        int v = n - number;
        System.out.print(v + " ");
        seq.add(v);
        combinationSum3(k, num + 1, n - number, number + 1, seq);
        seq.remove(seq.size() - 1);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        ArrayList<Integer> seq = new ArrayList<>();
        combinationSum3(k, 1, n, 1, seq);
        return ans;
    }
}