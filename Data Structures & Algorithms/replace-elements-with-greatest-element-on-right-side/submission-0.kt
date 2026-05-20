class Solution {
    fun replaceElements(arr: IntArray): IntArray {
          val n = arr.size
          var grt = -1
          val result = IntArray(n)
          for(i in n - 1 downTo 0){
             val current = arr[i]
             result[i] = grt
             if (current > grt) grt = current  
          }
        return result    
    }
}
