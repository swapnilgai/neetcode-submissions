class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
         var left = 0       
        for(n in nums){
           if(n != `val`) {
            nums[left] = n 
            left++
           }   
        }
        return left
    }
}
