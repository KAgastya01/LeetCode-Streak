class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String baseline = strs[0];

        for (int i = 0; i < baseline.length(); i++){
            char c = baseline.charAt(i);

            for (int j = 1; j < strs.length; j++){
                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    return baseline.substring(0, i);
                }
            }
        }
        return baseline;
    }
}