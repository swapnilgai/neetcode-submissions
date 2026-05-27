class Solution {
    fun countSeniors(details: Array<String>): Int {
        var result = 0
        for(current in details){
           val nStr = "${current[11]}${current[12]}" 
           if(nStr.toInt()>60) result++ 
        }
        return result
    }
}
