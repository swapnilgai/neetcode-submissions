class Solution {
    fun lengthOfLastWord(s: String): Int {
        val arr = s.split(" ")

        for(i in arr.size - 1 downTo 0){
            if(arr[i].length > 0) return arr[i].length
        }
        return 0
    }
}
