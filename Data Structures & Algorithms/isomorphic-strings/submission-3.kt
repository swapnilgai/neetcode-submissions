class Solution {
  fun isIsomorphic(s: String, t: String): Boolean {
    return helper(s , t) && helper(t, s)
  }

    fun helper(s: String, t: String): Boolean {
         val map = mutableMapOf<Char, Char>()

         if(s.length != t.length) return false
         for(i in s.indices) {
            val sC = s[i]
            val tC = t[i]
            if(map.contains(sC)) {
                if(tC != map[sC]) return false
            } else map[sC] = tC   
         }  
         return true 
    }
}
