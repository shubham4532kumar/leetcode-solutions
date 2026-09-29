class Solution {
    int n;
    List<List<Integer>> res = new ArrayList<>();
      void solve(int i , int[] candidates,int sum,List<Integer> list,int target){

        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }

         if(i>=n || sum>target){
            return;
        }

            list.add(candidates[i]);
            solve(i,candidates,sum+candidates[i],list,target);
             list.remove(list.size()-1);

            solve(i+1,candidates,sum,list,target);
      }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         n = candidates.length;
        List<Integer> list = new ArrayList<>();
         solve(0,candidates,0,list,target); 

         return res;
    }
}