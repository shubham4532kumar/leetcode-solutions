class Solution {
    List<String> res;
    public void solve(String curr , int n,int open,int closed){
        
          if(curr.length()==2*n){
                  res.add(curr);
              return;
          }
            if(open<n){
        solve(curr+'(',n,open+1,closed);
            }
            if(closed<open){
        solve(curr+')',n,open,closed+1);
            }
    }
    public List<String> generateParenthesis(int n) {
         String curr = "";
         res = new ArrayList<>();
         solve(curr,n,0,0);

         return res;
    }
}