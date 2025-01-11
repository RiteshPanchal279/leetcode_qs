public class SearchMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean ans1=searchMatrix(matrix,5);
        System.out.println(ans1);//true

        boolean ans2=searchMatrix(matrix,6);
        System.out.println(ans2);//false
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int row =0;
        int col=matrix[0].length-1;
        int rows=matrix.length;
// Traversing full metrix array
        while(row < rows && col >= 0){
            // if element found in matrix return true
            if(matrix[row][col]==target){
                return true;
            }
// Traversing start from the top right from matrix
// array is in increasing order if element is less then target so move ahead row
            if(matrix[row][col] < target){
                row++;
            }else{
// element is grater then target so col will reduce
                col--;
            }
        }
        return false; // not found
    }
}
