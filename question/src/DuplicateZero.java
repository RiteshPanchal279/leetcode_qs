public class DuplicateZero {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for(int i:arr){
            System.out.print(i+",");
        }
    }
    static void duplicateZeros(int[] arr) {
        int zeros=0;
        int n= arr.length;
//        count total zero in array
        for(int i:arr){
            if(i==0){
                zeros++;
            }
        }
//        start array from end to avoid overwriting elements before they are duplicated.
        for(int i=n-1;i>=0;i--){
//            condition for prevent ArrayIndexOutOfBoundException
            if(i + zeros < n){
                arr[i+zeros]=arr[i];
            }
            if(arr[i] == 0){
                zeros--;
                if(i + zeros < n){
                    arr[i+zeros]=0;
                }
            }
        }
    }
}
