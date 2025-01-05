public class RemoveTheElement {
    public static void main(String[] args) {
        int[] num={3,2,2,3,5};
        int ans=removeEle(num,2);
        System.out.println(ans);
//        the ans is 3 because val=2 in array count of 2 is 2 and remaining element is 3
    }

    public static int removeEle(int[] nums,int val){
        int k=0;
        for (int i=0;i< nums.length;i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
//        the k is the new size of array after removing 'val' elements
        return k;
    }
}
