class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        int low = 0;
        int high = n-1;
        int firstOccurance = -1;
        int lastOccurance = -1;
        int left = 0;
        int right = 0;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                firstOccurance = mid;
                lastOccurance = mid;
                left = mid;
                right = mid;

                while(left>=0 && nums[left]==target){
                    firstOccurance = left;
                    left--;
                }
                while(right<n && nums[right]==target){
                    lastOccurance = right;
                    right++;;
                }
                break;
            }else if(nums[mid]<target){
                 low = mid + 1;
            }else{
                high = mid -1;
            }

        }

            if(firstOccurance!=-1){
        for(int i =firstOccurance;i<=lastOccurance;i++){
            res.add(i);
        }
            }

        return res;
    }
}