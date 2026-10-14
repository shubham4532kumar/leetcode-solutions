class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if(sum>num*9){
            return "";
        }
        int nines = sum/9;
        int rem = sum%9;
                StringBuilder res = new StringBuilder();
        res.append("9".repeat(nines));

        if(rem>0){
            res.append(rem);
        }

        while (res.length() < num) {
            res.append('0');
        }

        return res.toString();

    }
}