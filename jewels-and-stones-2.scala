object Solution {
    def numJewelsInStones(J: String, S: String): Int = {
        return S.filter(J.indexOf(_) !=  -1).length
    }
}
