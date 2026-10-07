class Solution {
    int n;
    int minRemove;
    Set<String> res = new HashSet<>();
    void solve(String s,int i,int left,int right,String ans,int remove){
        if(right>left){
           return;
        }
          if(i==n){
             if(right==left){
                if (remove < minRemove) {
                    minRemove = remove;
                    res.clear();
                    res.add(ans);
                } 
                else if (remove == minRemove) {
                    res.add(ans);
                }
             }
             return;
          }

          if(s.charAt(i)=='('){
            solve(s,i+1,left+1,right,ans+s.charAt(i),remove);

            solve(s,i+1,left,right,ans,remove+1);
         }

         else if(s.charAt(i)==')'){
            solve(s,i+1,left,right+1,ans+s.charAt(i),remove);

            solve(s,i+1,left,right,ans,remove+1);
         }
         else {
            solve(s, i + 1, left, right,
                  ans + s.charAt(i), remove);
        }
    }
    public List<String> removeInvalidParentheses(String s) {
        n = s.length();
        minRemove = Integer.MAX_VALUE;
         solve(s,0,0,0,"",0);
         return new ArrayList<>(res);
    }
}