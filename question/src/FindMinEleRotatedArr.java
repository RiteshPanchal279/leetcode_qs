public class FindMinEleRotatedArr {

    public static void main(String[] args) {
    int[] nums = {3,4,5,1,2};
        int ans=findMin(nums);
        System.out.println("The minimum element in rotated is: "+ans);
    }

    static int findMin(int[] nums) {
        int pivote=findPivot(nums);
        // check if array is not rotated so ans is first element of array
        if(pivote == -1){
            return nums[0];
        }
        return nums[pivote+1];
    }

    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
//            4 cases that we have written in book
//            we took mid<end because what if mid is last ele of array that why
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else {
//                start < arr[mid]
                start=mid+1;
            }
        }
        return -1;
    }

}
