class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;

        for(int i =0;i<m;i++){
             int ones = 0;
            for(int j =0;j<n;j++){
                if(mat[i][j]==1){
                    ones++;
                }
                if(ones>max){
                    max = ones;
                    index = i;
                }
            }
        }
        return new int[]{index,max};
    }
}