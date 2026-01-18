class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop(); 

                if(ch == ')' && top!='(' ||
                   ch=='}' && top!='{' ||
                   ch==']' && top!='['
                ) return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
}