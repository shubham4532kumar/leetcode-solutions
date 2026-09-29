class Solution {
    int foundThresold(int mid,int[] nums){
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%mid==0){
                sum += nums[i]/mid;
            }else{
                sum += (nums[i]/mid) + 1;
            }
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
          int low = 1;
          int high = Arrays.stream(nums).max().getAsInt();
          int ans = Integer.MAX_VALUE;
          while(low<=high){
            int mid = low + (high-low)/2;
            int k = foundThresold(mid,nums);
            if(k<=threshold){
              ans = Math.min(ans,mid);
              high = mid-1;
            }else{
                low = mid+1;
            }
          }
          return ans;
    }
}