import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] ans=searchRange(nums,8);
        System.out.println(Arrays.toString(ans));

    }

    static public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end= search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] nums,int target ,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end= nums.length-1;

        while (start <= end) {
            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }else{
//                here is when target==nums[mid] and possible answer
//                assign the mid value to ans
                ans=mid;
//                the helper argument findStartIndex to evaluate start index
                if(findStartIndex){
//                    here we want start index that's why we do end=mid-1 from that half array
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
