public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,8};
        int ans=searchInsert(nums,2);
        System.out.println(ans);
    }
    static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while (start <= end){
            int mid= start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
