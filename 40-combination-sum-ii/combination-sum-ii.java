class Solution {
    int n;
    List<List<Integer>> res = new ArrayList<>();
    void solve(int i, int[] candidates,int sum,int target,List<Integer> list){
         if(sum==target){
            res.add(new ArrayList<>(list));
            return;
         }
         if(i>=n || sum>target){
            return;
         }

         list.add(candidates[i]);
         solve(i+1,candidates,sum+candidates[i],target,list);
         list.remove(list.size()-1);

         int next = i+1;

         while(next<n && candidates[next]==candidates[i]){
            next++;
         }

         solve(next,candidates,sum,target,list);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         n = candidates.length;
         Arrays.sort(candidates);
         List<Integer> list = new ArrayList<>();
         solve(0,candidates,0,target,list);

         return res;
    }
}