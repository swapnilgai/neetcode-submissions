import kotlin.math.abs

class Solution {
    fun scoreOfString(s: String): Int {
        var result = 0

        for(i in s.length - 1 downTo 1){
            var current = s[i] - s[i-1]
            if(current < 0) current = -1 * current 
            result += current
        }
        return result
    }
}
