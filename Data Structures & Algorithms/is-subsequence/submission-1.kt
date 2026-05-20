class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var left = 0
        if(left == s.length) return true
        for(c in t){
            if(c == s[left]) left++   
            if(left == s.length) return true
        }
        return false
    }
}
