class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxCount = 0
        var currentCount = 0 
        for(n in nums){
            if(n == 0) currentCount = 0
            else currentCount++
            if(maxCount < currentCount) maxCount = currentCount
        } 
        return maxCount
    }
}
