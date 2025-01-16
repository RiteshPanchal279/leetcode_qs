//https://leetcode.com/problems/container-with-most-water/?envType=problem-list-v2&envId=two-pointers
public class MaxArea {
    public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    int ans=maxArea(height);
        System.out.println(ans);
    }
    static int maxArea(int[] height) {
        int maxArea=0;
        int i=0; // start index
        int k=height.length-1; // last index

        while(i < k){
//            the ans is the rectangle which contain most water
//            here width is (k-i) and multiply with minimum height
            maxArea=Math.max(maxArea,(k-i) * Math.min(height[i],height[k]));
//      moving i if it is less than last element
            if(height[i] < height[k]){
                i++;
            }else{
                k--;
            }
        }
        return maxArea;
    }
}
