class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        String res = "";

        for(List<String> list : knowledge){
            String key = list.get(0);
            String value = list.get(1);

          map.put(key,value);  
        }
          
          for(int i = 0;i<s.length();i++){
                 
                 if(s.charAt(i)=='('){
                    String str = "";
                    i++;
                    while(i<s.length() && s.charAt(i)!=')'){
                        str = str + s.charAt(i);
                        i++;
                    }
                    if(map.containsKey(str)){
                        res = res + map.get(str);
                    }else{
                        res = res + "?";
                    }
                 }else{
                    res += s.charAt(i);
                 }
                


          }

          return res;

    }
}