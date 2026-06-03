class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
      
      val set = mutableSetOf<String>()

      for(email in emails){
        val emailSplit = email.split("@")
        val domain = emailSplit[1]
        val address = emailSplit[0]

        var cleanAddress = address.split("+")[0]
        cleanAddress = cleanAddress.replace(".", "")

        set.add("$cleanAddress@$domain")

      }
      return set.size
    }
}
