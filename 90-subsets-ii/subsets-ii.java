class Solution {
    int n;
    List<List<Integer>> res = new ArrayList<>();

    void solve(int[] nums,int i, List<Integer> list){
         if(i==n){
            res.add(new ArrayList<>(list));
            return;
         }

        list.add(nums[i]);
        solve(nums,i+1,list);

        //backtrack
        list.remove(list.size()-1);

         while(i<n-1 && nums[i]==nums[i+1]){
            i = i+1;
        }

        solve(nums,i+1,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        n = nums.length;
         Arrays.sort(nums);
        solve(nums,0,list);

        return res;
    }
}