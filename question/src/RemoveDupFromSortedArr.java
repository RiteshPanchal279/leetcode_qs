public class RemoveDupFromSortedArr {
    public static void main(String[] args) {
    int[] arr={1,2,2,3};
    int ans=removeDuplicates(arr);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i = 1; i < nums.length; i++) {
           if(nums[i]!=nums[j]){
               j++;
               nums[j]=nums[i];
           }
        }
        return j+1;
    }
}
