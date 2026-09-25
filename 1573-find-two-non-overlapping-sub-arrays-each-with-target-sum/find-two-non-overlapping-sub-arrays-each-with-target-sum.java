class Solution {
     
    public int minSumOfLengths(int[] arr, int target) {
        int sum = 0;
        int left = 0;
         int[] minsumtilli = new int[arr.length];
         int res = Integer.MAX_VALUE;
         int bestest = Integer.MAX_VALUE;
         Arrays.fill(minsumtilli,Integer.MAX_VALUE);
         for(int i = 0;i<arr.length;i++){
             sum += arr[i];
             while(sum>target){
                sum -= arr[left];
                left++;
             }
             if (i > 0) {
                minsumtilli[i] = minsumtilli[i - 1];
            }
             if(sum==target){
                 int len = i-left+1;
                 if(left>0 && minsumtilli[left-1]!=Integer.MAX_VALUE){
                    res = Math.min(res,minsumtilli[left-1]+len);
                 }

                 bestest = Math.min(bestest,len);
         }
              minsumtilli[i] = bestest;
         }

         
        return res == Integer.MAX_VALUE?-1:res;
    }
}