class Solution {
    int n;
    Map<Integer,Integer> map = new HashMap<>();
    List<List<Integer>> res = new ArrayList<>();
    void solve(int[] nums, List<Integer> list){

        if(list.size()==n){
           res.add(new ArrayList<>(list));
           return;
        }
           

           for(int i =0;i<n;i++){
              if(map.get(nums[i])>0){
                 list.add(nums[i]);
                 map.put(nums[i],map.get(nums[i])-1);

                 solve(nums,list);
                 list.remove(list.size()-1);
                 map.put(nums[i],map.get(nums[i])+1);


           while(i+1<n && nums[i+1]==nums[i]){
               i = i+1;
         }

              }
           }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        n = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Arrays.sort(nums);

        solve(nums,list);

        return res;
    }
}