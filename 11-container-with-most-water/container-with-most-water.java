class Solution {
    public int maxArea(int[] height) {
        int finalArea = 0;
        int start = 0, next = height.length-1;
        while(start<next){
            int area = Math.min(height[start], height[next])*(next-start);
            finalArea = Math.max(finalArea, area);
            if(height[start]<height[next]){
                start++;
            }
            else{next--;}
        }
        return finalArea;
    }
}