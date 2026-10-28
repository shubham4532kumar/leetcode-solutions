class Solution {
    int m;
    int n;
    int[][] directions = {
    {-1, 0}, 
    {1, 0},   
    {0, -1}, 
    {0, 1}    
};
      boolean solve(int[][] grid,int i,int j){
          if(i<0 || i>=m || j<0 || j>=n){
            return false;
          }

          if(grid[i][j]==1){
            return true;
          }

          grid[i][j] = 1;

          boolean closed = true;

          for(int k =0;k<4;k++){
             int nr = i + directions[k][0];
             int nc = j + directions[k][1];

             if(!solve(grid,nr,nc)){
                 closed = false;
             }
          }
          return closed;
      }
    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
       int count = 0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]==0){
                    if(solve(grid,i,j)){
                        count++;
                    }
                }else{
                    continue;
                }
            }
        }
        return count;
    }
}