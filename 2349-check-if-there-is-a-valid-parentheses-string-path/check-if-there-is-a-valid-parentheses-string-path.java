class Solution {
    int m;
    int n;
    Boolean[][][] dp;
    boolean solve(int row,int col,char[][] grid,int count){
        if(row<0 || row>=m || col<0 || col>=n){
             return false;
           }

           if(grid[row][col]=='('){
            count++;
           }else{
            count--;
           }
           if(count<0){
            return false;
           }
           if(row==m-1 && col==n-1){
             return count==0;
           }
           if(dp[row][col][count]!=null){
            return dp[row][col][count];
           }

         boolean left = solve(row+1,col,grid,count);
         boolean right = solve(row,col+1,grid,count);

         return dp[row][col][count] = left || right;
    }
    public boolean hasValidPath(char[][] grid) {
        if(grid[0][0]==')'){
            return false;
        }
           m = grid.length;
           n = grid[0].length;

           dp = new Boolean[m][n][m+n];
           return solve(0,0,grid,0);

       
    }
}