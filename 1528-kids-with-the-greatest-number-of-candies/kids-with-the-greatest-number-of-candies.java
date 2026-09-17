class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > maxCandies) maxCandies = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            int totalCandies = candies[i] + extraCandies;
            if(totalCandies >= maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        } 
        return result;
    }
}