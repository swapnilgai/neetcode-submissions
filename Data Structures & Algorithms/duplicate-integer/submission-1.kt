class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val check = mutableSetOf<Int>()
        for(i in nums.indices){
            if(check.add(nums[i]) == false) return true
        }
        return false
    }
}
