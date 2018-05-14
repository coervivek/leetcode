class Solution {
    public int numJewelsInStones(String J, String S) {
        return (int) S.chars().filter(c -> J.indexOf(c) != -1).count();
    }
}
