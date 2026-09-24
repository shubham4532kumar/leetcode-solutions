class Solution {
    public int smallestIndex(int[] nums) {
         int n = nums.length;
         for(int i =0;i<n;i++){
            int digit = nums[i];
            int sum = 0;
            while(digit>0){
                int rem = digit % 10;
                sum += rem;
                digit /= 10;
            }
            if(sum==i){
                return i;
            }
         }
         return -1;
    }
}