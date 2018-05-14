object Solution {
    def numJewelsInStones(J: String, S: String): Int = {
        val jewels = S.filter(J.indexOf(_) !=  -1)
        return jewels.length
    }
}
